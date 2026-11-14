package studentoovp.controller;

import studentoovp.database.DatabaseConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ReportsController {

    // ── SECTION 1: HITUNG TOTAL STUDENT ────────────────
    public int getTotalAllStudents() {
        return countQuery("SELECT COUNT(*) FROM students");
    }

    public int getTotalStudentByMajor(String majorCode) {
        String sql = "SELECT COUNT(*) FROM students s " +
                     "JOIN majors m ON s.major_id = m.major_id " +
                     "WHERE m.code = ?";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, majorCode);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) return rs.getInt(1);
        } catch (Exception e) {
            System.out.println("getTotalStudentByMajor error: " + e.getMessage());
        }
        return 0;
    }

    public int getTotalNotEnrolled() {
        String sql = "SELECT COUNT(*) FROM students s " +
                     "WHERE s.student_id NOT IN " +
                     "(SELECT DISTINCT student_id FROM class_enrollments)";
        return countQuery(sql);
    }

    // ── SECTION 2: SUBJECT PER MAJOR ───────────────────
    // Mengembalikan list: {subject_name, class_level}
    public List<String[]> getSubjectsByMajor(String major) {
        List<String[]> list = new ArrayList<>();
        String sql = "SELECT subject_name, class_level FROM subjects " +
                     "WHERE major = ? ORDER BY class_level, subject_id";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, major);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new String[]{
                    rs.getString("subject_name"),
                    "Class " + rs.getInt("class_level")
                });
            }
        } catch (Exception e) {
            System.out.println("getSubjectsByMajor error: " + e.getMessage());
        }
        return list;
    }

    public int getTotalSubjectsByMajor(String major) {
        String sql = "SELECT COUNT(*) FROM subjects WHERE major = ?";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, major);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) return rs.getInt(1);
        } catch (Exception e) {
            System.out.println("getTotalSubjectsByMajor error: " + e.getMessage());
        }
        return 0;
    }

    // ── SECTION 3: STUDENT PER KELAS ───────────────────
    public int countStudentsInClass(String major, int classLevel) {
        String sql = "SELECT COUNT(*) FROM class_enrollments " +
                     "WHERE major = ? AND class_level = ?";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, major);
            ps.setInt(2, classLevel);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) return rs.getInt(1);
        } catch (Exception e) {
            System.out.println("countStudentsInClass error: " + e.getMessage());
        }
        return 0;
    }

    // Ambil daftar student di kelas tertentu
    public List<String[]> getStudentsInClass(String major, int classLevel) {
        List<String[]> list = new ArrayList<>();
        String sql = "SELECT s.student_id, s.name " +
                     "FROM class_enrollments ce " +
                     "JOIN students s ON ce.student_id = s.student_id " +
                     "WHERE ce.major = ? AND ce.class_level = ? " +
                     "ORDER BY s.name";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, major);
            ps.setInt(2, classLevel);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new String[]{
                    rs.getString("student_id"),
                    rs.getString("name")
                });
            }
        } catch (Exception e) {
            System.out.println("getStudentsInClass error: " + e.getMessage());
        }
        return list;
    }

    // ── SECTION 4: STUDENT BELUM ENROLLED ──────────────
    public void loadNotEnrolledToTable(DefaultTableModel model,
                                        String keyword,
                                        String majorFilter) {
        model.setRowCount(0);
        StringBuilder sql = new StringBuilder(
            "SELECT s.student_id, s.name, m.code, s.gpa, s.enrollment_date " +
            "FROM students s " +
            "JOIN majors m ON s.major_id = m.major_id " +
            "WHERE s.student_id NOT IN " +
            "(SELECT DISTINCT student_id FROM class_enrollments) ");

        if (!majorFilter.equals("ALL")) {
            sql.append("AND m.code = '").append(majorFilter).append("' ");
        }
        if (!keyword.isEmpty()) {
            sql.append("AND (s.name LIKE '%").append(keyword)
               .append("%' OR s.student_id LIKE '%").append(keyword).append("%') ");
        }
        sql.append("ORDER BY m.code, s.name");

        try (Connection con = DatabaseConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql.toString())) {
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("student_id"),
                    rs.getString("name"),
                    rs.getString("code"),
                    rs.getDouble("gpa"),
                    rs.getString("enrollment_date")
                });
            }
        } catch (Exception e) {
            System.out.println("loadNotEnrolled error: " + e.getMessage());
        }
    }

    // ── HELPER ─────────────────────────────────────────
    private int countQuery(String sql) {
        try (Connection con = DatabaseConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            if (rs.next()) return rs.getInt(1);
        } catch (Exception e) {
            System.out.println("countQuery error: " + e.getMessage());
        }
        return 0;
    }
}