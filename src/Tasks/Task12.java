package Tasks;

public class Task12 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int M = 5;
        int L = 2;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % M == L){
                System.out.println(arr[i]);
            }
        }
    }
}

