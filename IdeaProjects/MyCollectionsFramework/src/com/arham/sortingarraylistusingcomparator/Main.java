package com.arham.sortingarraylistusingcomparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();

        students.add(new Student(1, "Ahmed", 25));
        students.add(new Student(2, "Bilal", 20));
        students.add(new Student(3, "Zahid", 30));
        students.add(new Student(4, "Ali", 21));
        students.add(new Student(5, "Munir", 19));
        students.add(new Student(5, "Zahid", 28));
        students.add(new Student(6, "Ali", 27));
        students.add(new Student(7, "Munir", 21));
        students.add(new Student(8, "Zahid", 37));
        students.add(new Student(9, "Ali", 50));
        students.add(new Student(10, "Bilal", 29));

        Collections.sort(students, new MyComparator());
        for (Student student : students)
            System.out.println(student);
        
    }
}