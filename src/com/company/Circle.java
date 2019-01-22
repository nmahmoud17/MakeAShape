package com.company;

public class Circle {

    // pi r^2
    private double radius;
    private double diameter;
    private double circumference;
    private double area;

    public void setRadius(int radiusMeasurement) {
        radius = radiusMeasurement;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateDiameter() {
        return diameter = radius * 2;

    }

    public double calculateCircumference() {
        return circumference = diameter * 3.14;
    }

    public double calculateCircleArea() {
        return area = 3.14 * radius;
    }


    public void circleInfo() {
        System.out.print("The circle's radius is " + radius);
        System.out.print("The circle's diameter is " + diameter);
        System.out.print("The circle's circumference is " + circumference);
        System.out.print("The circle's area is " + area);

    }
}