package calculator;

import java.util.Scanner;

public class Test11 {


    public static double input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        if (scanner.hasNextDouble()) {
            return scanner.nextDouble();
        } else {
            System.out.println("Error!Repeat input!");
            return input();
        }
    }

    public static String chooseOperation(double firstNumber, double secondNumber) {
        Scanner scanner = new Scanner(System.in);
        String resultChoose;
        String tmp="result = ";
        System.out.println("Choose the operation:\n 1.<+>\n 2.<->\n 3.<*>\n 4.</>\n");
        if (scanner.hasNext()) {
            resultChoose = scanner.nextLine();
        } else {
            System.out.println("Error!Repeat input operation!");
            return chooseOperation(firstNumber, secondNumber);
        }
        switch (resultChoose) {
            case "+":
                System.out.print(add(firstNumber, secondNumber));
                break;
            case "-":
                System.out.print(subtract(firstNumber, secondNumber));
                break;
            case "*":
                System.out.print(multiply(firstNumber, secondNumber));
                break;
            case "/":
                System.out.print(divide(firstNumber, secondNumber));
                break;
            default:
                System.out.println("Input Error! Repeat Input:");
                return chooseOperation(firstNumber, secondNumber);
        }
        return "result "+ resultChoose+"asdasd";
    }

    public static double add(double firstNumber, double secondNumber) {
        double result = firstNumber + secondNumber;
        return result;
    }

    public static double subtract(double firstNumber, double secondNumber) {
        double result = firstNumber - secondNumber;
        return result;
    }

    public static double divide(double firstNumber, double secondNumber) {
        double result = firstNumber / secondNumber;
        return result;
    }

    public static double multiply(double firstNumber, double secondNumber) {
        double result = firstNumber * secondNumber;
        return result;
    }

    public static void main(String[] args) {
        double number1 = input();
        double number2 = input();
        String result="result"+chooseOperation(number1,number2);


    }
}
