import java.util.Arrays;
import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstLine = scanner.nextLine();

        String[] firstNumbers = firstLine.split("(\t| )");
        int[][] array = new int[firstNumbers.length][firstNumbers.length];
        int raw = 0;

        for (int i = 0; i < firstNumbers.length; i++) {
            array[raw][i] = Integer.parseInt(firstNumbers[i]);
        }
        raw++;
        while (raw < firstNumbers.length) {
            String nextLine = scanner.nextLine();
            String[] numbers = nextLine.split("(\t| )");
            for (int i = 0; i < numbers.length; i++) {
                array[raw][i] = Integer.parseInt(numbers[i]);
            }
            raw++;
        }
        int[] result = new int[firstNumbers.length * 2 + 2];
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];


            }
            result[i] = sum;

        }
        int sumOfDiagonal = 0;
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    sumOfDiagonal += array[i][j];
                }
            }
        }

        System.out.println(sumOfDiagonal);

    }

}

