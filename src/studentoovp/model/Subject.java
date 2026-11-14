/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentoovp.model;

/**
 *
 * @author ain saipi
 */
public class Subject {
    private String subjectId;
    private String subjectName;
    private String major;       // "IS" atau "IT"
    private int classLevel;     // 1, 2, 3

    public Subject(String subjectId, String subjectName, String major, int classLevel) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.major = major;
        this.classLevel = classLevel;
    }

    // Getter & Setter
    public String getSubjectId()   { return subjectId; }
    public String getSubjectName() { return subjectName; }
    public String getMajor()       { return major; }
    public int getClassLevel()     { return classLevel; }

    public void setSubjectId(String id)     { this.subjectId = id; }
    public void setSubjectName(String name) { this.subjectName = name; }
    public void setMajor(String major)      { this.major = major; }
    public void setClassLevel(int level)    { this.classLevel = level; }
}
