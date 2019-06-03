package tasks;

public class Task16 {
    public static void main(String[] args) {
        int[] array = {2, 5, 9, 0, 5, 7, 8, 1};
        for (int i = 0; i < array.length / 2; i++) {
            System.out.println(array[i] + " : " + array[array.length / 2 + i]);
        }
    }
}

