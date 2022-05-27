package com.arham.calculatearea;

import static com.arham.calculatearea.AreaCalculation.calculateArea;

public class Main {
    public static void main(String[] args) {

        System.out.println("*** Calculating Area using Compile-time Polymorphism ***");
        System.out.println();

        System.out.println(calculateArea(3.5, 6.0));
        System.out.println(calculateArea(7, 3));
        System.out.println(calculateArea(5.5));

        System.out.println();
        System.out.println("*** Calculating Area using Run-time Polymorphism ***");
        System.out.println();

        Triangle triangle = new Triangle();
        System.out.println(triangle.calculateArea(3.5, 6.0));

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.calculateArea(7.0, 3.0));

        Circle circle = new Circle();
        System.out.println(circle.calculateArea(5.5, 3.1415));
    }
}