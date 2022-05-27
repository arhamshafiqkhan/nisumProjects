package com.arham.calculatearea;

public class Triangle extends Area {
    @Override
    public String calculateArea(double base, double altitude) {
        double area = 0.5 * base * altitude;
        return "Area of the given triangle is : " + String.format("%.3f", area) + " squared units.";
    }
}
