package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean createAnotherShape = true;
        int answer;
        Square mySquare = new Square();
        Circle myCircle = new Circle();
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


            answer = reader.nextInt();
            reader.nextLine();

            switch (answer) {
                case 1:

                    System.out.println("Enter the length of one side of your square");
                    double squareSide = reader.nextDouble();
                    mySquare.setSideLength(squareSide);
                    mySquare.getSideLength();
                    mySquare.calculateSquareArea();
                    mySquare.squareInfo();
                    createAnotherShape = true;
                    break;

                case 2:
                    System.out.println("Please enter the radius of your circle");
                    double radius = reader.nextDouble();
                    myCircle.setRadius(radius);
                    myCircle.calculateDiameter();
                    myCircle.calculateCircumference();
                    myCircle.calculateCircleArea();
                    myCircle.circleInfo();
                    createAnotherShape = true;
                    break;

                case 3:
                    System.out.println("Please enter the base height of your triangle");
                    double baseHeight = reader.nextDouble();
                    myTriangle.setHeightB(baseHeight);
                    System.out.println("Please enter the base length of your triangle");
                    double baseLength = reader.nextDouble();
                    myTriangle.setBaseLength(baseLength);
                    myTriangle.calculateTriangleArea();
                    myTriangle.triangleInfo();
                    createAnotherShape = true;
                    break;

                case 4:
                    System.out.println("Thanks for making shapes!");
                    createAnotherShape = false;
                    break;

                default:
                    System.out.println("Make sure you type one of the options!");
                    createAnotherShape = true;

            }

        }while (createAnotherShape) ;

        }
    }


