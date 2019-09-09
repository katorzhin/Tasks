package tasks;

import java.util.Scanner;

public class Module4GoIt {
    static void counterNumbers(int numbers) {
        for (int i = 1; i < numbers + 1; i++) {
            System.out.println(i);
        }
    }

    static void drawRectangle(int height, int weight) {
        for (int i = 0; i < height; i++) {
            System.out.println();
            for (int j = 0; j < weight; j++) {
                System.out.print("+");
            }
        }
    }


    static void drawRectangle(int weight) {
        for (int i = 0; i < weight; i++) {
            System.out.println();
            for (int j = 0; j < weight; j++) {
                System.out.print("+");
            }
        }
    }

    static void getMax(int a, int b) {
        if (a > b) {
            System.out.println("Максимальное число = " + a);
        } else if (a == b) {
            System.out.println(a + " = " + b);
        } else {
            System.out.println("Максимальное число = " + b);
        }
    }

    static void getMax(float a, float b) {
        if (b > a) {
            System.out.println(b);
        } else if (b == a) {
            System.out.println(a + "=" + b);
        } else {
            System.out.println(a);
        }
    }

    static void getMaxInScanner() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    static String countNumbersWithoutCycle(int numbers) {
        if (numbers <= 0) {
            return " ";
        }
        String result = countNumbersWithoutCycle(numbers - 1);
        return result + " " + numbers;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выбирете номер задания от 1 до 5");
        int chooseTask = scanner.nextInt();

        switch (chooseTask) {

            case 1:
                System.out.println("Ввведите число для первого задания!");
                int task1 = scanner.nextInt();
                counterNumbers(task1);
                break;
            case 2:
                System.out.println("Введите высоту для второго задания:");
                int numberFirstTask2 = scanner.nextInt();
                System.out.println("Введите ширину для второго задания:");
                int numberSecondTask2 = scanner.nextInt();
                drawRectangle(numberFirstTask2, numberSecondTask2);
                break;
            case 3:
                System.out.println("Введите ширину квадрата для третьего задания:");
                int numberTask3 = scanner.nextInt();
                drawRectangle(numberTask3);
            case 4:
                System.out.println("Введите первое число для четвертого задания:");
                int numberFirstTask4 = scanner.nextInt();
                System.out.println("Введите второе число для четвертого задания:");
                int numberSecondTask4 = scanner.nextInt();
                getMax(numberFirstTask4, numberSecondTask4);
            case 5:
                System.out.println("Введите число для 5-го задания:");
                int numberTask5 = scanner.nextInt();
                System.out.println(countNumbersWithoutCycle(numberTask5));
        }
    }
}

