package ArrayList;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(6);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) < arrayList.get(i + 1)) {
                System.out.println("increasing sequence");
            } else {
                System.out.println("not increasing sequence");
            }
        }
    }
}
