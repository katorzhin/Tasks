package Tasks;

import java.util.Arrays;

public class Task_24 {
    public static void main(String[] args) {
        int[] array = {-2, -8, 4, 5, 3, -11, 9, 7};
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i]) > max) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
