package calculator;

import java.util.Scanner;

import static calculator.Operation.*;

public class InputData {

    public static double inputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        if (scanner.hasNextDouble()) {
            return scanner.nextDouble();
        } else {
            System.out.println("Error!Repeat inputNumber!");
            return inputNumber();
        }
    }

    public static String chooseOperation(double firstNumber, double secondNumber, String resultChoose) {
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
                return getOperation();
        }
        return resultChoose;
    }
}
