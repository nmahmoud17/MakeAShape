package com.company;

public class Triangle {

    private double heightB;
    private double baseLength;
    private double area;
    private double half = .5;

    public void setHeightB(double triangleHeight) {
        heightB = triangleHeight;
    }

    public double getHeightB() {
        return heightB;
    }

    public void setBaseLength(double triangleBase) {
        baseLength = triangleBase;
    }

    public double getBaseLength() {
        return baseLength;
    }

    public double calculateTriangleArea() {
        area = half * (heightB * baseLength);
        return area;
    }

    public void triangleInfo() {
        System.out.print("YOUR TRIANGLE'S PROPERTIES");
        System.out.print("\n");
        System.out.print("--------------------------------------------" + "\n");
        System.out.print("Your lovely triangle's area is" + area + "\n");
        System.out.print("\n");
        System.out.print("FunFact: Every triangle has 3 sides, and I couldn't find another fun fact");
        System.out.print("\n");
        System.out.print("--------------------------------------------");
        System.out.print("\n");


    }

}
