import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        double enterFirstNumber = scanner.nextDouble();

        System.out.println("Enter second number:");
        double enterSecondNumber = scanner.nextDouble();

        System.out.println("Choose one of the operations:\n1.<+>\n2.<->\n3.<*>\n4.</>");

        String result = scanner.next();
        switch (result) {
            case "-":
                System.out.println(subtract(enterFirstNumber, enterSecondNumber));
                break;
            case "+":
                System.out.println(add(enterFirstNumber, enterSecondNumber));
                break;
            case "*":
                System.out.println(multiply(enterFirstNumber, enterSecondNumber));
                break;
            case "/":
                System.out.println(divide(enterFirstNumber, enterSecondNumber));
                break;

        }
    }

    public static double subtract(double firstNumber, double secondNumber) {

        double result = firstNumber - secondNumber;
        return result;
    }

    public static double add(double firstNumber, double secondNumber) {

        double result = firstNumber + secondNumber;
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
}

