package Tasks;

public class Task14 {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 2, 7, 8, 2, 9, 2, 10};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 2) {
                count++;
            }
        }
        System.out.println(count + " students are not allowed to the second exam.");
    }

}
