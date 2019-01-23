package com.company;

public class Square {


    private int sideLength;
    private int area;

    public void setSideLength (int squareSide) {

        sideLength = squareSide;
    }

    public int getSideLength() {

        return sideLength;
    }


    public  int calculateSquareArea() {
        area = sideLength * sideLength;
        return area;
    }

    public void squareInfo(){

        System.out.print("SQUARE PROPERTIES");
        System.out.print("\n");
        System.out.print("--------------------------------------------");
        System.out.print("\n");
        System.out.print("--Each side of the square is " + getSideLength() + " inches long");
        System.out.print("\n");
        System.out.print ("--The square's area is " + calculateSquareArea() + " square inches");
        System.out.print("\n");
        System.out.print ("--Fun Fact: A Square is also a rectangle with equal sides" );
        System.out.print("--------------------------------------------");


    }



}
