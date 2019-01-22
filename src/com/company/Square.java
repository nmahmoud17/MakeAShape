package com.company;

public class Square {


    private int side;

    public void setSide (int squareSide) {
        side = squareSide;
    }

    public int getSide() {
        return side;
    }



    public  int calculateSquareArea(int side) {
        int area = side * side;
        return area;
    }


}
