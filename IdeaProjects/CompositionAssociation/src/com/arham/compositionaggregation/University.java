package com.arham.compositionaggregation;

public class University {
    private String name;
    private String address;
    private int estYear;
    private Department department; // composition
    private TeachingStaff teacher; // aggregation

    public University(String name, String address, int estYear, TeachingStaff teacher) {
        this.name = name;
        this.address = address;
        this.estYear = estYear;
        this.department = new Department(); // composition
        this.teacher = teacher; // aggregation
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", estYear=" + estYear +
                ", department=" + department +
                ", teacher=" + teacher +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getEstYear() {
        return estYear;
    }

    public void setEstYear(int estYear) {
        this.estYear = estYear;
    }

    public University(String name, String address, int estYear) {
        this.name = name;
        this.address = address;
        this.estYear = estYear;
    }
}
