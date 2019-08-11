package calculator;

import java.util.Scanner;

public class Operation {
    public static String getOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the operation:\n 1.<+>\n 2.<->\n 3.<*>\n 4.</>\n");
        String resultChoose;
        if (scanner.hasNext()) {
            resultChoose = scanner.nextLine();
        } else {
            System.out.println("Error!Repeat inputNumber operation!");
            return getOperation();
        }

        return resultChoose;
    }

    public static double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public static double subtract(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public static double divide(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    public static double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }
}
