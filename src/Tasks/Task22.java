package Tasks;

public class Task22 {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 9, 4, 6, 8,};
        int m = 11;
        boolean check = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > m) {
                check = true;
                System.out.println(array[i]);
            }
        }
        if (!check){
            System.out.println("There are no such numbers.");
        }
    }

}
