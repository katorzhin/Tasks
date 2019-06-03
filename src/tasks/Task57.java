package tasks;

import java.util.Arrays;

public class Task57 {
    public static void main(String[] args) {
        int[] arrayOfNumbers = {1, 2, 3, 4, 3, 2, 1};
        int[] newArrayOfNumbers = new int[arrayOfNumbers.length];

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (!(contains(newArrayOfNumbers, arrayOfNumbers[i]))) {
                  newArrayOfNumbers[i]=arrayOfNumbers[i];
            }
        }
        System.out.println(Arrays.toString(newArrayOfNumbers));
    }

    public static boolean contains(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }
}
