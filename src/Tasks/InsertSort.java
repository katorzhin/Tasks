package Tasks;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] array = {5, 3, 7, 2, 9, 1};
        int sv;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                sv = array[i + 1];
                array[i + 1] = array[i];

                System.out.println(array[i]);
                ;
                while (i > 0 && sv < array[i - 1]) {
                    array[i] = array[i - 1];
                    i--;
                }
                array[i]=sv;
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
