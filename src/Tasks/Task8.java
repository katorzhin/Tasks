package Tasks;

public class Task8 {
    public static void main(String[] args) {
        int[] array = {5, 10, 15, 20, 25, 30, 35,};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 10 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }


}
