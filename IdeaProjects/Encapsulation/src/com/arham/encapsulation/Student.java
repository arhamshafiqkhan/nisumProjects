package com.arham.encapsulation;

import java.util.List;

public class Student {
    private String name;

    private List<Student> students;
    private String fatherName;
    private String className;
    private int rollNumber;

    public Student(String name, String fatherName, String className, int rollNumber) {
        this.name = name;
        this.fatherName = fatherName;
        this.className = className;
        this.rollNumber = rollNumber;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}
