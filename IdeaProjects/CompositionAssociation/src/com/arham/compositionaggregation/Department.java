package com.arham.compositionaggregation;

// association using composition
public class Department {
    private String name;
    private int numberOfRooms;

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", NumberOfRooms=" + numberOfRooms +
                '}';
    }
    // default constructor
    public Department() {
        this.name = "CS";
        this.numberOfRooms = 11;
    }
    public Department(String name, int numberOfRooms) {
        this.name = name;
        this.numberOfRooms = numberOfRooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        numberOfRooms = numberOfRooms;
    }
}
