package Tasks;

public class Task11 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] <= i ? array[i] : " ");
        }
    }
}
