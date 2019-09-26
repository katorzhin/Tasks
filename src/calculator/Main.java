package calculator;

import java.io.FileWriter;
import java.io.IOException;

import static calculator.InputData.chooseOperation;
import static calculator.InputData.inputNumber;
import static calculator.Operation.getOperation;

public class Main {
    private static String fileName;



    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("calculator.csv",true);




        double number1 = inputNumber();
        double number2 = inputNumber();
        String operation = getOperation();

        String result = chooseOperation(number1, number2, operation);
        fw.append("Operation");
        fw.append("\n");

        fw.append(result);
        fw.append(operation);

        fw.close();

    }
}
