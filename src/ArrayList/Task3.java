package arrayList;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(-2);
        arrayList.add(3);
        arrayList.add(-4);
        arrayList.add(6);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) > 0) {
                System.out.println("positive numbers");
            } else {
                System.out.println("negative numbers");
            }
        }


    }


}
