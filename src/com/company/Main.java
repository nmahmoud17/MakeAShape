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
            answer = reader.next();

            if (answer.equals("Square")) {
                System.out.println("What is the length of the square's side?");
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

            } else {
                System.out.println ("Make sure you type one of the shapes!");
                createAnotherShape = false;
            }


        } while (createAnotherShape);
    }
}
