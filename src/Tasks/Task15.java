package Tasks;

public class Task15 {
    public static void main(String[] args) {
        int[] array = {2, 5, 9, 0, 4, 7};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            if (array[i] == 0)
                break;
        }

    }
}
