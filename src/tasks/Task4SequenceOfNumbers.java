package tasks;

public class Task4SequenceOfNumbers {
    public static void main(String[] args) {
        int a[] = {-10, -5, -2, -1, 1, 2, 3, 34, 86};
        boolean b=isIncremental(a);
        System.out.println(b);
    }

    private static boolean isIncremental(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if(!(a[i]>a[i-1])){
                return false;
            }
        }
        return true;
    }
}