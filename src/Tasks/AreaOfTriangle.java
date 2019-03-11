package Tasks;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторону А треугольника: ");
        double sideA = scanner.nextDouble();

        System.out.println("Введите сторону B треугольника ");
        double sideB = scanner.nextDouble();

        System.out.println("Введите сторону C треугольника ");
        double sideC = scanner.nextDouble();

        double perimeter2 = (sideA + sideB + sideC) / 2;

        double square = Math.sqrt(perimeter2 * (perimeter2 - sideA) * (perimeter2 - sideB) * (perimeter2 - sideC));

        System.out.println("Площадь треугольника равна : "+ square);
    }
}