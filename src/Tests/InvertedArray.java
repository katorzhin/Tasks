package Tests;


public class InvertedArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 10, 8, 30, 5};
        int temp = 0;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
