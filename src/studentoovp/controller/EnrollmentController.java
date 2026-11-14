/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentoovp.controller;

import studentoovp.database.DatabaseConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class EnrollmentController {
    
    
   // Proses daftar student yang belum enroll    
public List<String[]> getStudents(String keyword, String major) {
    List<String[]> list = new ArrayList<>();
    try {
        Connection con = DatabaseConnection.getConnection();
        String sql;
        PreparedStatement ps;

        if (major.equals("ALL")) {
            // Hanya tampilkan student yang BELUM di-enroll di kelas manapun
            sql = "SELECT s.student_id, s.name, m.code " +
                  "FROM students s JOIN majors m ON s.major_id = m.major_id " +
                  "WHERE (s.student_id LIKE ? OR s.name LIKE ?) " +
                  "AND s.student_id NOT IN (" +
                  "    SELECT student_id FROM class_enrollments" +
                  ") " +
                  "ORDER BY s.name";
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + keyword + "%");
            ps.setString(2, "%" + keyword + "%");
        } else {
            // Filter by major + belum di-enroll
            sql = "SELECT s.student_id, s.name, m.code " +
                  "FROM students s JOIN majors m ON s.major_id = m.major_id " +
                  "WHERE m.code = ? " +
                  "AND (s.student_id LIKE ? OR s.name LIKE ?) " +
                  "AND s.student_id NOT IN (" +
                  "    SELECT student_id FROM class_enrollments" +
                  ") " +
                  "ORDER BY s.name";
            ps = con.prepareStatement(sql);
            ps.setString(1, major);
            ps.setString(2, "%" + keyword + "%");
            ps.setString(3, "%" + keyword + "%");
        }

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            list.add(new String[]{
                rs.getString("student_id"),
                rs.getString("name"),
                rs.getString("code")
            });
        }
        con.close();
    } catch (Exception e) {
        System.out.println("getStudents error: " + e.getMessage());
    }
    return list;
}

    // ── HITUNG STUDENT PER KELAS ────────────────────────
    public int countStudentsInClass(String major, int classLevel) {
        try {
            Connection con = DatabaseConnection.getConnection();
            String sql = "SELECT COUNT(*) FROM class_enrollments " +
                         "WHERE major = ? AND class_level = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, major);
            ps.setInt(2, classLevel);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int count = rs.getInt(1);
                con.close();
                return count;
            }
            con.close();
        } catch (Exception e) {
            System.out.println("countStudents error: " + e.getMessage());
        }
        return 0;
    }

    // CEK Validasi KELAS PENUH max 20
    public boolean isClassFull(String major, int classLevel) {
        return countStudentsInClass(major, classLevel) >= 20;
    }

    // CEK VALIDASI STUDENT YANG SUDAH ENROLLED 
    public boolean isAlreadyEnrolled(String studentId, String major, int classLevel) {
        try {
            Connection con = DatabaseConnection.getConnection();
            String sql = "SELECT COUNT(*) FROM class_enrollments " +
                         "WHERE student_id = ? AND major = ? AND class_level = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, studentId);
            ps.setString(2, major);
            ps.setInt(3, classLevel);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                boolean result = rs.getInt(1) > 0;
                con.close();
                return result;
            }
            con.close();
        } catch (Exception e) {
            System.out.println("isAlreadyEnrolled error: " + e.getMessage());
        }
        return false;
    }

    // VALIDASI ENROLL STUDENT KE KELAS
    public int enrollStudent(String studentId, String major, int classLevel) {
        // Return: 0=sukses, 1=penuh, 2=sudah enrolled, 3=error
        if (isClassFull(major, classLevel)) return 1;
        if (isAlreadyEnrolled(studentId, major, classLevel)) return 2;

        try {
            Connection con = DatabaseConnection.getConnection();
            String sql = "INSERT INTO class_enrollments " +
                         "(student_id, major, class_level, enrolled_date) " +
                         "VALUES (?, ?, ?, CURDATE())";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, studentId);
            ps.setString(2, major);
            ps.setInt(3, classLevel);
            ps.executeUpdate();
            con.close();
            return 0;
        } catch (Exception e) {
            System.out.println("enrollStudent error: " + e.getMessage());
            return 3;
        }
    }

    // HAPUS ENROLLMENT
    public boolean deleteEnrollment(int enrollmentId) {
        try {
            Connection con = DatabaseConnection.getConnection();
            String sql = "DELETE FROM class_enrollments WHERE enrollment_id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, enrollmentId);
            ps.executeUpdate();
            con.close();
            return true;
        } catch (Exception e) {
            System.out.println("deleteEnrollment error: " + e.getMessage());
            return false;
        }
    }

    // ── LOAD SUBJECTS PER KELAS (untuk tampilan di panel) ──
    public List<String> getSubjectsInClass(String major, int classLevel) {
        List<String> list = new ArrayList<>();
        try {
            Connection con = DatabaseConnection.getConnection();
            String sql = "SELECT subject_name FROM subjects " +
                         "WHERE major = ? AND class_level = ? ORDER BY subject_id";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, major);
            ps.setInt(2, classLevel);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(rs.getString("subject_name"));
            }
            con.close();
        } catch (Exception e) {
            System.out.println("getSubjectsInClass error: " + e.getMessage());
        }
        return list;
    }

    // ── LOAD ENROLLED LIST KE JTABLE ───────────────────
    public void loadEnrolledToTable(DefaultTableModel model,
                                     String majorFilter,
                                     String classFilter) {
        model.setRowCount(0);
        try {
            Connection con = DatabaseConnection.getConnection();
            StringBuilder sql = new StringBuilder(
                "SELECT ce.enrollment_id, s.student_id, s.name, " +
                "ce.major, ce.class_level, ce.enrolled_date " +
                "FROM class_enrollments ce " +
                "JOIN students s ON ce.student_id = s.student_id " +
                "WHERE 1=1 ");

            if (!majorFilter.equals("ALL")) {
                sql.append("AND ce.major = '").append(majorFilter).append("' ");
            }
            if (!classFilter.equals("ALL")) {
                sql.append("AND ce.class_level = ").append(classFilter).append(" ");
            }
            sql.append("ORDER BY ce.major, ce.class_level, s.name");

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql.toString());
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("enrollment_id"),
                    rs.getString("student_id"),
                    rs.getString("name"),
                    rs.getString("major"),
                    "Class " + rs.getInt("class_level"),
                    rs.getString("enrolled_date")
                });
            }
            con.close();
        } catch (Exception e) {
            System.out.println("loadEnrolled error: " + e.getMessage());
        }
    }
    
    // ── UPDATE ENROLLMENT (pindah kelas) ────────────────
public boolean updateEnrollment(int enrollmentId, String major, int newClassLevel) {
    try (Connection con = DatabaseConnection.getConnection()) {
        
        // Cek dulu kelas tujuan tidak penuh
        String cekSql = "SELECT COUNT(*) FROM class_enrollments " +
                        "WHERE major = ? AND class_level = ? AND enrollment_id != ?";
        PreparedStatement cek = con.prepareStatement(cekSql);
        cek.setString(1, major);
        cek.setInt(2, newClassLevel);
        cek.setInt(3, enrollmentId);
        ResultSet rs = cek.executeQuery();
        if (rs.next() && rs.getInt(1) >= 20) {
            return false; // kelas penuh
        }

        // Update kelas dan tanggal
        String sql = "UPDATE class_enrollments " +
                     "SET class_level = ?, enrolled_date = CURDATE() " +
                     "WHERE enrollment_id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, newClassLevel);
        ps.setInt(2, enrollmentId);
        ps.executeUpdate();
        return true;

    } catch (Exception e) {
        System.out.println("updateEnrollment error: " + e.getMessage());
        return false;
    }
}

// ── AMBIL ENROLLMENT ID DARI STUDENT ID ─────────────
public int getEnrollmentId(String studentId) {
    try (Connection con = DatabaseConnection.getConnection()) {
        String sql = "SELECT enrollment_id FROM class_enrollments " +
                     "WHERE student_id = ? LIMIT 1";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, studentId);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) return rs.getInt("enrollment_id");
    } catch (Exception e) {
        System.out.println("getEnrollmentId error: " + e.getMessage());
    }
    return -1;
}
}