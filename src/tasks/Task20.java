package tasks;

public class Task20 {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int max = 0;
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                if (array[i] < min) {
                    min = array[i];
                }
            } else if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max + min);
    }
}
