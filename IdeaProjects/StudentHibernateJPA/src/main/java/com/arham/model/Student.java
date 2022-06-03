package com.arham.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int rollNo;
    private String studentName;
    private String className;

    public Student() {
        super();
    }

    public Student(int rollNo, String studentName, String className) {
        this.rollNo = rollNo;
        this.studentName = studentName;
        this.className = className;
    }

    public Student(int rollNo, String studentName, String className, List<Course> courses) {
        this.rollNo = rollNo;
        this.studentName = studentName;
        this.className = className;
        this.courses = courses;
    }

    @ManyToMany
    @JoinTable
    private List<Course> courses = new ArrayList<>();

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", rollNo=" + rollNo +
                ", studentName='" + studentName + '\'' +
                ", className='" + className + '\'' +
                ", courses=" + courses +
                '}';
    }
}
