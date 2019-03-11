package Tasks;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side A of the triangle:");
        double sideA = scanner.nextDouble();

        System.out.println("Enter the side B of the triangle: ");
        double sideB = scanner.nextDouble();

        System.out.println("Enter the side C of the triangle: ");
        double sideC = scanner.nextDouble();

        double perimeter2 = (sideA + sideB + sideC) / 2;

        double square = Math.sqrt(perimeter2 * (perimeter2 - sideA) * (perimeter2 - sideB) * (perimeter2 - sideC));

        System.out.println("The area of a triangle is: "+ square);
    }
}