package studentoovp.controller;

import studentoovp.database.DatabaseConnection;
import studentoovp.model.Subject;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SubjectController {

    // Generate ID: SUB-IS-01, SUB-IT-03, dst
    public String generateSubjectId(String major) {
        String prefix = "SUB-" + major + "-";
        String query  = "SELECT subject_id FROM subjects " +
                        "WHERE major = ? ORDER BY subject_id DESC LIMIT 1";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, major);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String lastId = rs.getString("subject_id");
                int lastNum   = Integer.parseInt(lastId.replace(prefix, ""));
                return String.format("%s%02d", prefix, lastNum + 1);
            }
        } catch (SQLException e) {
            System.out.println("generateId error: " + e.getMessage());
        }
        return prefix + "01";
    }

    // Cek apakah kelas sudah penuh (max 3 subject per kelas per major)
    public boolean isClassFull(String major, int classLevel) {
        String query = "SELECT COUNT(*) FROM subjects " +
                       "WHERE major = ? AND class_level = ?";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, major);
            ps.setInt(2, classLevel);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) return rs.getInt(1) >= 4;
        } catch (SQLException e) {
            System.out.println("isClassFull error: " + e.getMessage());
        }
        return false;
    }

    // Simpan subject baru
    public boolean saveSubject(Subject subject) {
        if (isClassFull(subject.getMajor(), subject.getClassLevel())) {
            return false;
        }
        String query = "INSERT INTO subjects " +
                       "(subject_id, subject_name, major, class_level) " +
                       "VALUES (?, ?, ?, ?)";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, subject.getSubjectId());
            ps.setString(2, subject.getSubjectName());
            ps.setString(3, subject.getMajor());
            ps.setInt(4, subject.getClassLevel());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("saveSubject error: " + e.getMessage());
            return false;
        }
    }

    // Update subject
    public boolean updateSubject(Subject subject) {
        String query = "UPDATE subjects SET subject_name=?, major=?, class_level=? " +
                       "WHERE subject_id=?";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, subject.getSubjectName());
            ps.setString(2, subject.getMajor());
            ps.setInt(3, subject.getClassLevel());
            ps.setString(4, subject.getSubjectId());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("updateSubject error: " + e.getMessage());
            return false;
        }
    }

    // Hapus subject
    public boolean deleteSubject(String subjectId) {
        String query = "DELETE FROM subjects WHERE subject_id=?";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, subjectId);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("deleteSubject error: " + e.getMessage());
            return false;
        }
    }

    // Ambil subject filter by major
    public List<Subject> getSubjectsByMajor(String major) {
        List<Subject> list  = new ArrayList<>();
        String query = major.equals("ALL")
            ? "SELECT * FROM subjects ORDER BY major, class_level, subject_id"
            : "SELECT * FROM subjects WHERE major=? ORDER BY class_level, subject_id";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            if (!major.equals("ALL")) ps.setString(1, major);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Subject(
                    rs.getString("subject_id"),
                    rs.getString("subject_name"),
                    rs.getString("major"),
                    rs.getInt("class_level")
                ));
            }
        } catch (SQLException e) {
            System.out.println("getSubjectsByMajor error: " + e.getMessage());
        }
        return list;
    }

    // Ambil subject by major + class level spesifik
    public List<Subject> getSubjectsByClass(String major, int classLevel) {
        List<Subject> list = new ArrayList<>();

        String query;
        boolean isAll = major.equals("ALL");
        if (isAll) {
            query = "SELECT * FROM subjects WHERE class_level=? " +
                    "ORDER BY major, subject_id";
        } else {
            query = "SELECT * FROM subjects WHERE major=? AND class_level=? " +
                    "ORDER BY subject_id";
        }

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            if (isAll) {
                ps.setInt(1, classLevel);
            } else {
                ps.setString(1, major);
                ps.setInt(2, classLevel);
            }
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Subject(
                    rs.getString("subject_id"),
                    rs.getString("subject_name"),
                    rs.getString("major"),
                    rs.getInt("class_level")
                ));
            }
        } catch (SQLException e) {
            System.out.println("getSubjectsByClass error: " + e.getMessage());
        }
        return list;
    }

    // Hitung jumlah subject di kelas tertentu
    public int countSubjectsInClass(String major, int classLevel) {
        String query = "SELECT COUNT(*) FROM subjects " +
                       "WHERE major=? AND class_level=?";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, major);
            ps.setInt(2, classLevel);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) return rs.getInt(1);
        } catch (SQLException e) {
            System.out.println("countSubjectsInClass error: " + e.getMessage());
        }
        return 0;
    }
}