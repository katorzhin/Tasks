package tasks;

public class Task56 {
    public static void main(String[] args) {
        int[] array = {1,2,1};
        int[] newArray = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (!(contains(newArray,array[i]))){
                newArray[i]=array[i];
                count++;
            }
        }

        System.out.println(count);

    }

    public static boolean contains(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }
}








