package Tasks;

import java.util.Arrays;

public class Task56 {
    public static void main(String[] args) {
        int[] array = {1, 2, 2,4, 3, 3, 1};
        int count = 0;
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    newArray[i] = array[j];
                    count++;
                    System.out.println(Arrays.toString(newArray));
                }

            }
        }
        System.out.println(count);

    }
}








