import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {


        double num1 = getNumber();
        double num2 = getNumber();
        char operation = getOperation();
        double result = calc(num1, num2, operation);
        System.out.println("Result: " + result);

    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double sub(double num1, double num2) {
        return num1 - num2;
    }

    public static double mul(double num1, double num2) {
        return num1 * num2;
    }

    public static double div(double num1, double num2) {
        return num1 / num2;
    }

    public static double getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        if (scanner.hasNextDouble()) {
            return scanner.nextDouble();
        } else {
            System.out.println("Input Error! Repeat Input:");
            return getNumber();
        }

    }

    public static char getOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select operation number:\n 1- to add.\n 2 - subtraction. \n 3 - multiply. \n 4 - divide.");
        int operationNumber;
        if (scanner.hasNextInt()) {
            operationNumber = scanner.nextInt();
        } else {
            System.out.println("You did not enter a number! Re-enter:");
            return getOperation();
        }
        switch (operationNumber) {
            case 1:
                return '+';
            case 2:
                return '-';
            case 3:
                return '*';
            case 4:
                return '/';
            default:
                System.out.println("Input Error! Repeat Input:");
                return getOperation();
        }
    }

    public static double calc(double num1, double num2, char operation) {
        switch (operation) {
            case '+':
                return add(num1, num2);
            case '-':
                return sub(num1, num2);
            case '*':
                return mul(num1, num2);
            case '/':
                return div(num1, num2);
            default:
                return Double.NaN;
        }
    }

}
