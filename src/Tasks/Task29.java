package Tasks;

public class Task29 {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10, 12, 16};
        int m = 4;
        int sqrt = m * m;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == sqrt) {
                System.out.println(array[i]);
            }
        }
    }
}
