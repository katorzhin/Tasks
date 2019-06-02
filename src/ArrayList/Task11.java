package arrayList;

import java.util.ArrayList;

public class Task11 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(10);
        arrayList.add(3);
        arrayList.add(20);
        arrayList.add(6);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) <= i) {
                System.out.println(arrayList.get(i));
            } else {
                System.out.println(" ");
            }
        }

    }
}
