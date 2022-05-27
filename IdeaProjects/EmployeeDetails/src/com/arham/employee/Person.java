package com.arham.employee;

public abstract class Person {
    private String name;
    private String fatherName;
    private String emailID;
    private String phoneNumber;

    public Person(String name, String fatherName, String emailID, String phoneNumber) {
        this.name = name;
        this.fatherName = fatherName;
        this.emailID = emailID;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
