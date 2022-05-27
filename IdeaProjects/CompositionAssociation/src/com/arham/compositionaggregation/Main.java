package com.arham.compositionaggregation;

public class Main {
    public static void main(String[] args) {
        //Department department = new Department("CS", 10);
        TeachingStaff teacher = new TeachingStaff("Prof Safdar", "Dean");
        University university = new University("NED UET", "University road, Khi", 1927, teacher);

        System.out.println(university.toString());
        System.out.println(teacher.toString());

    }
}
