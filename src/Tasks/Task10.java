package Tasks;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int max = array[0];
        int min = array[0];
        int sv = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        sv = max;
        max = min;
        min = sv;
        System.out.println(max);
        System.out.println(min);
    }
}
