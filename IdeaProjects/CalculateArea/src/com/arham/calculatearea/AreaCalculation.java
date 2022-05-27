package com.arham.calculatearea;

public class AreaCalculation {
    public static String calculateArea(double base, double altitude){
        double area = 0.5 * base * altitude;
        return "Area of the given triangle is : " + String.format("%.3f", area) + " squared units.";
    }

    public static String calculateArea(int width, int length){
        double area = length * width;
        return "Area of the given rectangle is : " + String.format("%.3f", area) + " squared units.";
    }

    public static String calculateArea(double radius){
        final double PI = 3.1415;
        double area = PI * radius * radius;
        return "Area of the given circle is : " + String.format("%.3f", area) + " squared units.";
    }
}
