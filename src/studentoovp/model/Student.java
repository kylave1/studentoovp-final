/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentoovp.model;

public class Student {
    private String studentId;
    private String name;
    private double gpa;
    private String enrollmentDate;
    private String majorId;
    private String email;
    private String phone;

    public Student() {}

    public Student(String studentId, String name, double gpa,
                   String enrollmentDate, String majorId,
                   String email, String phone) {
        this.studentId      = studentId;
        this.name           = name;
        this.gpa            = gpa;
        this.enrollmentDate = enrollmentDate;
        this.majorId        = majorId;
        this.email          = email;
        this.phone          = phone;
    }

    // Getters
    public String getStudentId()      { return studentId; }
    public String getName()           { return name; }
    public double getGpa()            { return gpa; }
    public String getEnrollmentDate() { return enrollmentDate; }
    public String getMajorId()        { return majorId; }
    public String getEmail()          { return email; }
    public String getPhone()          { return phone; }

    // Setters
    public void setStudentId(String studentId)           { this.studentId = studentId; }
    public void setName(String name)                     { this.name = name; }
    public void setGpa(double gpa)                       { this.gpa = gpa; }
    public void setEnrollmentDate(String enrollmentDate) { this.enrollmentDate = enrollmentDate; }
    public void setMajorId(String majorId)               { this.majorId = majorId; }
    public void setEmail(String email)                   { this.email = email; }
    public void setPhone(String phone)                   { this.phone = phone; }
    
    
}

/**
 *
 * @author ain saipi
 */

