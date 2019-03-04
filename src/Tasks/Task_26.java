package Tasks;

import java.util.Arrays;

public class Task_26 {
    public static void main(String[] args) {
        int[] array = {-2, -8, 4, 3, -11, 9, 7, -10};
        int p1 = 1;
        int p2 = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                p1 *= array[i];
            } else {
                p2 *= array[i];
            }
        }
        if (Math.abs(p1) > p2) {
            System.out.println("negative numbers are greater");
        } else
            System.out.println("positive numbers are greater");
        //  System.out.println(Math.abs(p1) > p2 ? "negative numbers are greater" : "positive numbers are greater");
    }
}
