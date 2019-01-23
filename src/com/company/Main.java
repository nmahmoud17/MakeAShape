package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean createAnotherShape = true;
        double answer;
        Square mySquare = new Square ();
        Circle myCircle = new Circle ();
        Triangle myTriangle = new Triangle();

        do {

            Scanner reader = new Scanner(System.in);
            System.out.println("\n");
            System.out.println("What shape would you like to print?");
            System.out.println("");
            System.out.println("1. Square");
            System.out.println("2. Circle");
            System.out.println("3. Triangle");
            System.out.println("4. Done with making shapes");


            answer = reader.nextDouble();

            if (answer==1) {
                System.out.println("Enter the length of one side of your square");
                    double squareSide = reader.nextDouble();
                    mySquare.setSideLength(squareSide);
                    mySquare.getSideLength();
                    mySquare.calculateSquareArea();
                    mySquare.squareInfo();

                    createAnotherShape = true;
            }

            else if  (answer==2){

            }

            else if (answer==3){

            }

            else if (answer==4) {
                createAnotherShape = false;
            }

            else {
                System.out.println ("Make sure you type one of the options!");
                createAnotherShape = true;
            }


        } while (createAnotherShape);
    }
}
