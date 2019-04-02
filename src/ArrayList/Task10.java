package ArrayList;

import java.util.ArrayList;

public class Task10 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int max = 0;
        int min = arrayList.get(0);
        int sw = 0;

        arrayList.add(1);
        arrayList.add(10);
        arrayList.add(3);
        arrayList.add(20);
        arrayList.add(6);

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) > max) {
                max = arrayList.get(i);
            }
            if (arrayList.get(i) < min) {
                min = arrayList.get(i);
            }
        }
        sw = max;
        max = min;
        min = sw;
        System.out.println(max);

    }
}
