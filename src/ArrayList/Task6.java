package ArrayList;

import java.util.ArrayList;

public class Task6 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(9);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(6);
        int max = 0;
        int min = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) > max) {
                max = arrayList.get(i);
            }
            if (arrayList.get(i) < min) {
                min = arrayList.get(i);
            }
        }
        System.out.println(min);
    }
}
