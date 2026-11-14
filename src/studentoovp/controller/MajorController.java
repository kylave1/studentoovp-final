package studentoovp.controller;

import studentoovp.database.DatabaseConnection;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class MajorController {

    // COUNT STUDENT PER MAJOR
    public int countStudentByMajor(String majorId) {
        String sql = "SELECT COUNT(*) AS total FROM students WHERE major_id = ?";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, majorId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) return rs.getInt("total");
        } catch (Exception e) {
            System.out.println("Count error: " + e.getMessage());
        }
        return 0;
    }

    // LOAD STUDENTS BY MAJOR
    public void loadStudentsByMajor(DefaultTableModel model, String majorId) {
        model.setRowCount(0);
        boolean isAll = majorId.equals("ALL");

        String sql;
        if (isAll) {
            sql = "SELECT s.student_id, s.name, m.code, s.gpa " +
                  "FROM students s JOIN majors m ON s.major_id = m.major_id " +
                  "ORDER BY m.code, s.name";
        } else {
            sql = "SELECT s.student_id, s.name, m.code, s.gpa " +
                  "FROM students s JOIN majors m ON s.major_id = m.major_id " +
                  "WHERE s.major_id = ? ORDER BY s.name";
        }

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            if (!isAll) ps.setString(1, majorId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("student_id"),
                    rs.getString("name"),
                    rs.getString("code"),
                    rs.getDouble("gpa")
                });
            }
        } catch (Exception e) {
            System.out.println("Load students error: " + e.getMessage());
        }
    }

    // LOAD SUBJECTS
public void loadSubjects(DefaultTableModel model, String majorFilter) {
    model.setRowCount(0);
    try {
        Connection con = DatabaseConnection.getConnection();
        String sql;
        PreparedStatement ps;

        if (majorFilter.equals("ALL")) {
            sql = "SELECT subject_id, subject_name, major, class_level " +
                  "FROM subjects ORDER BY major, class_level, subject_id";
            ps = con.prepareStatement(sql);
        } else {
            sql = "SELECT subject_id, subject_name, major, class_level " +
                  "FROM subjects WHERE major=? " +
                  "ORDER BY class_level, subject_id";
            ps = con.prepareStatement(sql);
            ps.setString(1, majorFilter);
        }

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getString("subject_id"),
                rs.getString("subject_name"),
                rs.getString("major"),
                rs.getString("class_level")   // index 3 = hidden MajorID diganti class_level
            });
        }
        con.close();
    } catch (Exception e) {
        System.out.println("Load subjects error: " + e.getMessage());
    }
}

    // HELPE Untuk get the major id
    public String getMajorIdByIndex(int index) {
        return index == 0 ? "MAJ-001" : "MAJ-002";
    }
}