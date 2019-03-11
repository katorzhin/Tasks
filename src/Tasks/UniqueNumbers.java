package Tasks;

import java.util.Arrays;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] array = {1, 1, 1, 1, 3, 2, 5, 3, 4};
        int[] newArray = new int[array.length];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (!contains(newArray, array[i])) {
                newArray[i] = array[i];
                counter++;
            }
        }
        System.out.println(counter);
        System.out.println(Arrays.toString(newArray));
    }

    public static boolean contains(int a[], int value) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == value) {
                return true;
            }
        }
        return false;
    }
}
