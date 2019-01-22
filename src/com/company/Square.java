package com.company;

public class Square {

    private int width;
    private int height;

    public void setWidth (int squareWidth) {
        width = squareWidth;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int squareHeight) {
        height = squareHeight;
    }

    public int getHeight() {
        return height;
    }

    public  int calculateSquareArea(int height, int width) {
        int area = height * width;
        return area;
    }


}
