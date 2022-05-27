package com.arham.inheritance;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", 27, "abc street, karachi");
        System.out.println(person.toString());

        System.out.println();

        Employee employee = new Employee("David", 30, "xyz street, Lahore", 102, "Assistant Manager");
        System.out.println(employee.toString());
    }
}
