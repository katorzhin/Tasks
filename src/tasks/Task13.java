package tasks;

public class Task13 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < arr.length; i=i+2) {
            int sv = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=sv;
        }
        System.out.println(arr[arr.length]);
    }
}
