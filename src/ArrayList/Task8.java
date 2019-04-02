package ArrayList;

import java.util.ArrayList;

public class Task8 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(10);
        arrayList.add(3);
        arrayList.add(20);
        arrayList.add(6);
        int count = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 10 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
