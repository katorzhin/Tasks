package Tasks;

import java.util.Arrays;

public class Task28 {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 12, 15};
        int b = 13;
        int index = 0;
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            if (b > array[i] && array[i + 1] > b) {
                index = array[i] + 1;

            }
        }
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        System.out.println(Arrays.toString(newArray));
        newArray[index] = b;
        System.out.println(Arrays.toString(newArray));
        for (int i = index; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }
        System.out.println(Arrays.toString(newArray));
    }
}
