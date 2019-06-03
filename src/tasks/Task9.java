package tasks;

public class Task9 {
    public static void main(String[] args) {
        int[] array = {-1, -2, 3, 0, 4, 5, 6, 7, 8, 9, 10, 11};
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        int zeroElements = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positiveNumbers++;
            }
            if (array[i] < 0) {
                negativeNumbers++;
            } else if (array[i] == 0) {
                zeroElements++;
            }
        }
        System.out.println("Positive numbers = " + positiveNumbers + "\n" + "negative numbers = " + negativeNumbers + "\n" + "zero elements = " + zeroElements);
    }
}
