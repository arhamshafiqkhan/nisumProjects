package com.arham.encapsulation;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Arham", "Shafiq", "9", 2103 );
        System.out.println(student.getName());

        //System.out.println(student.name); // not allowed since name is private
    }
}
