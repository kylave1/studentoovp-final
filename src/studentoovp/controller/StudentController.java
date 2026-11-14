package studentoovp.controller;

import studentoovp.database.DatabaseConnection;
import studentoovp.model.Student;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class StudentController {

    // ── Generate ID pakai MAX ──────────────────────────────
public String generateId() {
    // student_id format: 2025001 (7 char), max VARCHAR(10)
    String sql = "SELECT student_id FROM students ORDER BY student_id DESC LIMIT 1";
    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {
        if (rs.next()) {
            String lastId = rs.getString("student_id"); // contoh: "2025003"
            System.out.println("Last ID: " + lastId);
            int num = Integer.parseInt(lastId.substring(4)); // ambil "003" → 3
            return String.format("2025%03d", num + 1);       // → "2025004"
        }
    } catch (Exception e) {
        System.out.println("GenerateId error: " + e.getMessage());
    }
    return "2025001"; // default pertama kali
}

    // ── ADD STUDENT ───────────────────────────────────────
public boolean addStudent(Student s) {
    String sql = "INSERT INTO students (student_id, name, gpa, enrollment_date, major_id, email, phone) " +
                 "VALUES (?,?,?,?,?,?,?)";
    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setString(1, s.getStudentId());
        ps.setString(2, s.getName());
        ps.setDouble(3, s.getGpa());
        ps.setString(4, s.getEnrollmentDate());
        ps.setString(5, s.getMajorId());
        ps.setString(6, s.getEmail());
        ps.setString(7, s.getPhone());
        
        int rows = ps.executeUpdate();
        System.out.println("Rows inserted: " + rows);
        return rows > 0;
        
    } catch (SQLException e) {
        // Tampilkan error lengkap
        System.out.println("Add error code: " + e.getErrorCode());
        System.out.println("Add error msg : " + e.getMessage());
        e.printStackTrace();
        return false;
    }
}

    // ── UPDATE STUDENT ────────────────────────────────────
public boolean updateStudent(Student s) {
  String sql = "UPDATE students SET name=?, gpa=?, enrollment_date=?, " +
                 "major_id=?, email=?, phone=? WHERE student_id=?";
    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql)) {

        // DEBUG — cetak semua nilai sebelum eksekusi
        System.out.println("=== UPDATE DEBUG ===");
        System.out.println("student_id : " + s.getStudentId());
        System.out.println("name       : " + s.getName());
        System.out.println("gpa        : " + s.getGpa());
        System.out.println("date       : " + s.getEnrollmentDate());
        System.out.println("major_id   : " + s.getMajorId());
        System.out.println("email      : " + s.getEmail());
        System.out.println("phone      : " + s.getPhone());

        ps.setString(1, s.getName());
        ps.setDouble(2, s.getGpa());
        ps.setString(3, s.getEnrollmentDate());
        ps.setString(4, s.getMajorId());
        ps.setString(5, s.getEmail());
        ps.setString(6, s.getPhone());
        ps.setString(7, s.getStudentId());

        int rows = ps.executeUpdate();
        System.out.println("Rows updated: " + rows);
        System.out.println("====================");
        return rows > 0;

    } catch (SQLException e) {
        System.out.println("Update ERROR: " + e.getMessage());
        e.printStackTrace();
        return false;
    }
}
    // ── DELETE STUDENT ────────────────────────────────────
    public boolean deleteStudent(String studentId) {
        String sql = "DELETE FROM students WHERE student_id=?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, studentId);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Delete error: " + e.getMessage());
            return false;
        }
    }

    // ── LOAD ALL KE JTABLE ────────────────────────────────
    public void loadToTable(DefaultTableModel model) {
        model.setRowCount(0);
        String sql = "SELECT s.student_id, s.name, m.code, s.gpa, " +
                     "s.enrollment_date, s.email, s.phone " +
                     "FROM students s JOIN majors m ON s.major_id = m.major_id " +
                     "ORDER BY s.student_id";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("student_id"),
                    rs.getString("name"),
                    rs.getString("code"),
                    rs.getDouble("gpa"),
                    rs.getString("enrollment_date"),
                    rs.getString("email"),   // index 5 — tersembunyi di tabel
                    rs.getString("phone"),   // index 6 — tersembunyi di tabel
                    "Action"                 // index 7 — kolom tombol
                });
            }
        } catch (SQLException e) {
            System.out.println("Load error: " + e.getMessage());
        }
    }

    // ── SEARCH STUDENT ────────────────────────────────────
    public void searchToTable(DefaultTableModel model, String keyword, String majorId) {
        model.setRowCount(0);
        String sql = "SELECT s.student_id, s.name, m.code, s.gpa, " +
                     "s.enrollment_date, s.email, s.phone " +
                     "FROM students s JOIN majors m ON s.major_id = m.major_id " +
                     "WHERE (s.student_id LIKE ? OR s.name LIKE ?) ";
        if (!majorId.equals("ALL")) sql += "AND s.major_id = ? ";
        sql += "ORDER BY s.student_id";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, "%" + keyword + "%");
            ps.setString(2, "%" + keyword + "%");
            if (!majorId.equals("ALL")) ps.setString(3, majorId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("student_id"),
                    rs.getString("name"),
                    rs.getString("code"),
                    rs.getDouble("gpa"),
                    rs.getString("enrollment_date"),
                    rs.getString("email"),   // index 5 — tersembunyi
                    rs.getString("phone"),   // index 6 — tersembunyi
                    "Action"                 // index 7 — kolom tombol
                });
            }
        } catch (SQLException e) {
            System.out.println("Search error: " + e.getMessage());
        }
    }

    // ── HELPER MAJOR ID ───────────────────────────────────
    public String getMajorIdByIndex(int index) {
        return index == 0 ? "MAJ-001" : "MAJ-002";
    }

    public int getMajorIndexById(String majorId) {
        return majorId.equals("MAJ-001") ? 0 : 1;
    }
    
    // ── CHECK DUPLICATE NAME ──────────────────────────────
public boolean isNameDuplicate(String name, String excludeStudentId) {
    String sql = "SELECT COUNT(*) FROM students WHERE LOWER(name) = LOWER(?)";
    if (excludeStudentId != null && !excludeStudentId.isEmpty()) {
        sql += " AND student_id != ?";
    }
    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setString(1, name.trim());
        if (excludeStudentId != null && !excludeStudentId.isEmpty()) {
            ps.setString(2, excludeStudentId);
        }
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            return rs.getInt(1) > 0;
        }
    } catch (SQLException e) {
        System.out.println("Duplicate check error: " + e.getMessage());
    }
    return false;
}
}