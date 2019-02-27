package Tasks;

public class Task1ArrayMultiplesK {
    public static void main(String[] args) {
        int sum = 0;
        int[] array = {1, 2, 3, 4, 5, 67, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int k = 2;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % k == 0) {
                sum += array[i]+k;
                System.out.println(sum);
            }

        }

    }
}
