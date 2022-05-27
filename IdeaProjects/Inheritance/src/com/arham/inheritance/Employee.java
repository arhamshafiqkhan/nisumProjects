package com.arham.inheritance;

public class Employee extends Person {
    private int employeeID;
    private String jobTitle;

    public Employee(String name, int age, String address, int employeeID, String jobTitle) {
        super(name, age, address);
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                "} " + super.toString();
    }
}
