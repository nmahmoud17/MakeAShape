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
        System.out.print("The rectangle side length is " + getSideLength());
        System.out.print("\n");
        System.out.print ("The squares area is " + calculateSquareArea());

    }



}
