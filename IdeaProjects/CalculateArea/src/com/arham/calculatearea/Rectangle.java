package com.arham.calculatearea;

public class Rectangle extends Area {
    @Override
    public String calculateArea(double length, double width) {
        double area = length * width;
        return "Area of the given rectangle is : " + String.format("%.3f", area) + " squared units.";
    }
}
