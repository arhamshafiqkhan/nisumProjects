package com.arham.employee;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Arham", "Shafiq", "ashafiq@nisum.com", "0310-2522348",
                "Nisum, Pak", "Java Developer");

//        employee1.companyName = "Nisum, US";
//        employee1.setName("Arham Shafiq");

        System.out.println(employee1.toString());
    }
}
