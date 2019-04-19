package Tasks;

import java.util.Arrays;

public class Task60 {
    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 4, 5};
        int[] arrayB = {7, 88, 9, 99, 11};
        int[] arrayC = new int[arrayA.length + arrayB.length];

        for (int i = 0; i < arrayA.length; i++) {
            arrayC[i] = arrayA[i];
        }
        for (int i = 0; i < arrayB.length; i++) {
            arrayC[arrayA.length+i] = arrayB[i];
        }

        System.out.println(Arrays.toString(arrayC));
    }
}