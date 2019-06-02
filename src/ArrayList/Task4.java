package arrayList;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(9);
        arrayList.add(4);
        arrayList.add(6);
        boolean result = true;
        for (int i = 0; i < arrayList.size() - 1; i++) {
            if (arrayList.get(i) < arrayList.get(i + 1)) {
            } else {
                result = false;
            }
        }
        if(result==true){
            System.out.println("increasing");
        }
        else {
            System.out.println("not");
        }
    }
}
