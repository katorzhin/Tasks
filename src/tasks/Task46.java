package tasks;

public class Task46 {
    public static void main(String[] args) {
        int[] array = {9, 2, 7, 3, 11, 4, 1};
        int count = 0;
        int maxElement = 0;
        int minElement = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
            if (array[i] < minElement) {
                minElement = array[i];
            }
        }
        System.out.println("Max element = " + maxElement);
        System.out.println("Min element = " + minElement);
    }
}
