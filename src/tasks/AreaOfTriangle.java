package tasks;

import java.util.Scanner;

public class AreaOfTriangle {
    public static double Square(double side1, double side2, double side3) {
        double perimeter = (side1 + side2 + side3) / 2;
        double square = Math.sqrt(perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3));
        return square;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side A of the triangle:");
        double sideA = scanner.nextDouble();

        System.out.println("Enter the side B of the triangle: ");
        double sideB = scanner.nextDouble();

        System.out.println("Enter the side C of the triangle: ");
        double sideC = scanner.nextDouble();

        System.out.println("The area of a triangle is: " + Square(sideA, sideB, sideC));


    }


}