package Tasks;

public class Task55 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 3, 2, 1};
        int count = 0;
        for (int i = 0; i < array.length /2; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[i]) {
                    count++;

                }
            }

        }

        System.out.println(count);
    }

}
