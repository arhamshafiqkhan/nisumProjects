package com.arham.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Course {
    @Id
    private int id;
    private String courseName;
    @ManyToMany(mappedBy = "courses")
    /*
    here the mappedBy attribute indicates that the 'students' collection
    is mapped by the 'courses' collection of the owner side (Student class)
     */
    private List<Student> students = new ArrayList<>();

    public Course() {
        super();
    }

    public Course(int id, String courseName) {
        this.id = id;
        this.courseName = courseName;
    }

    public Course(int id, String courseName, List<Student> students) {
        this.id = id;
        this.courseName = courseName;
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
