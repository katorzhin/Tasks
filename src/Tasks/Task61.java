package Tasks;

import java.util.Arrays;

public class Task61 {
    public static void main(String[] args) {
        /*
        В массиве А каждый элемент равен 0, 1, 2. Переставить элементы массива так,
        чтобы сначала располагались все нули, затем все единицы, и, наконец все двойки.
         */
        int[] array = {3, 2, 1, 2, 0, 3, 1, 0, 3, 2};
        int tmp;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted=false;
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(array));


    }
}
