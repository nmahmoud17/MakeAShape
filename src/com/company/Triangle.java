package com.company;

public class Triangle {

    private double heightB;
    private double baseLength;
    private double area;
    private double half = .5;

    public void setHeightB(int triangleHeight) {
        heightB = triangleHeight;
    }

    public double getHeightB() {
        return heightB;
    }

    public void setBaseLength(int triangleBase) {
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
        System.out.print("Your lovely triangle's area is" + area);
        System.out.print("FunFact: Your Triangle has 3 sides");

    }

}
