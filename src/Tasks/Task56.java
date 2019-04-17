package Tasks;

import java.util.Arrays;

public class Task56 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 3, 1, 2, 5};
        int count = 0;
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {

            if (!(array[i] == newArray[i])) {
                newArray[i] = array[i];
                count++;
            }
        }
        System.out.println(count);
        System.out.println(Arrays.toString(newArray));
    }
}




