package calculator;

import static calculator.InputData.chooseOperation;
import static calculator.InputData.inputNumber;
import static calculator.Operation.getOperation;

public class Main {
    public static void main(String[] args) {
        double number1 = inputNumber();
        double number2 = inputNumber();
        String operation = getOperation();
        String result = chooseOperation(number1, number2, operation);
    }
}
