package tasks;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 8, 9, 10, 11};
        int z = 7;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                array[i] = z;
                count++;
            }
        }
        System.out.println("Количество замен = " + count);
        System.out.println(Arrays.toString(array));
    }
}
