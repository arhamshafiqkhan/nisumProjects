package com.arham.calculatearea;

public class Circle extends Area {
    @Override
    public String calculateArea(double radius, double PI) {
        double area = PI * radius * radius;
        return "Area of the given circle is : " + String.format("%.3f", area) + " squared units.";
    }
}
