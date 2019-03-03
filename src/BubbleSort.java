import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {2, 1, 3, 9, 8, 6, 4, 5, 7};
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int a = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = a;

                }

            }
        }
        System.out.println(Arrays.toString(array));
    }
}