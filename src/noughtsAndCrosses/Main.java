package noughtsAndCrosses;

import java.util.Arrays;

public class Main {
    private static char[][] array = new char[3][3];

    public static void main(String[] args) {


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = '-';
            }
        }
        printSquare();
    }

    public static void printSquare() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
