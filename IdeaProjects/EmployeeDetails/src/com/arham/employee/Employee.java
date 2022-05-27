package com.arham.employee;

public class Employee extends Person {
    public String companyName;
    public String jobDescription;

    public Employee(String name, String fatherName, String emailID, String phoneNumber, String companyName, String jobDescription) {
        super(name, fatherName, emailID, phoneNumber);
        this.companyName = companyName;
        this.jobDescription = jobDescription;
    }

    @Override
    public String toString() {
        return "Employee{" +
                " name='" + getName() + '\'' +
                ", fatherName='" + getFatherName() + '\'' +
                ", emailID='" + getEmailID() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                "companyName='" + companyName + '\'' +
                ", jobDescription='" + jobDescription + '\'' +
                '}';
    }
}
