package Tests;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа: ");

        int input = scanner.nextInt();
        int[] numbers = new int[input];
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i]=numbers.length-i;
            System.out.print(numbers[i]+" ");
        }
    }
}
