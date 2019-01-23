package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean createAnotherShape = true;
        String answer;
        Square mySquare = new Square ();
        Circle myCircle = new Circle ();
        Triangle myTriangle = new Triangle();

        do {

            Scanner reader = new Scanner(System.in);
            System.out.println("\n");
            System.out.println("What shape would you like to print?");
            System.out.println("");
            System.out.println("Square");
            System.out.println("Circle");
            System.out.println("Triangle");
            System.out.println("Enter 'Done' if you're over making shapes");


            answer = reader.next();

            if (answer.equals("Square")) {
                System.out.println("Enter the length of one side of your square");
                    int squareSide = reader.nextInt ();
                    mySquare.setSideLength(squareSide);
                    mySquare.getSideLength();
                    mySquare.calculateSquareArea();
                    mySquare.squareInfo();

                    createAnotherShape = true;
            }

            else if  (answer.equals ("Circle")){

            }

            else if (answer.equals ("Triangle")){

            }

            else if (answer.equals ("Done")) {
                createAnotherShape = false;
            }

            else {
                System.out.println ("Make sure you type one of the options!");
                createAnotherShape = true;
            }


        } while (createAnotherShape);
    }
}
