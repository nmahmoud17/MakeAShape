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
        return circumference = diameter * Math.PI;
    }

    public double calculateCircleArea() {
        return area = Math.PI * radius;
    }


    public void circleInfo() {
        System.out.print("The circle's radius is " + radius);
        System.out.print("The circle's diameter is " + diameter);
        System.out.print("The circle's circumference is " + circumference);
        System.out.print("The circle's area is " + area);
        System.out.println("FunFact: In situations where there are no navigational clues " +
                "– such as a snowstorm or thick fog – " +
                "humans always end up going around in circles.\n" +
                "\n");

    }
}