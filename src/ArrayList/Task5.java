package ArrayList;

import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(9);
        arrayList.add(4);
        arrayList.add(6);
        ArrayList<Integer> newArrayList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) {

                arrayList.get(i);
                newArrayList.add(i);

            }
        }
        System.out.println(newArrayList);
    }
}
