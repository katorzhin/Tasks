package ArrayList;

import java.util.ArrayList;

public class Task7 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(6);
        int count = 0;
        int z = 7;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) > z) {
                //   arrayList.get(i) = z;
                count++;
            }
        }
        System.out.println("number of replacements: " + count);
    }
}
