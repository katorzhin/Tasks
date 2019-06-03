package tasks;

import java.util.Arrays;

public class Task27 {
    public static void main(String[] args) {


        int[] array = {2, -30, -40, 10, 7, 8, 2, 9, 2, 10};
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                array[i] = 0;
                break;
            }
        }
        System.out.println(Arrays.toString(array));
    }

}
