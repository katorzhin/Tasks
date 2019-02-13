package Tests;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int cnt, i = 0;
        System.out.println("Введите количество элементов в вашем массиве целых чисел: ");
        cnt = scanner.nextInt();
        int[] array = new int[cnt];
        System.out.println("Заполните Ваш целочисленный массив:");
        System.out.println();
        while (i < cnt) {
            System.out.println("Введите  " + i + " целочисленных элементов в вашем массиве: ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Ваш массив целых чисел заполнен!");
        System.out.println();
        int ind = -1;
        while (ind < 0 || ind >= cnt) {
            System.out.println("Enter index of element in your integer array \n"  +
                    "(это может быть только целое число от 0 до " + (cnt - 1) + "): ");
            ind = scanner.nextInt();
        }
        System.out.println("Значение элемента " + ind + " is: " + array[ind]);
    }
}