package arrayList;

import java.util.ArrayList;

public class Task9 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        int zeroElements = 0;

        arrayList.add(-1);
        arrayList.add(1);
        arrayList.add(-2);
        arrayList.add(-5);
        arrayList.add(0);
        arrayList.add(9);
        arrayList.add(0);
        arrayList.add(11);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) > 0) {
                positiveNumbers++;
            }
            if (arrayList.get(i) == 0) {
                zeroElements++;
            }
            if (arrayList.get(i) < 0) {
                negativeNumbers++;
            }
        }
        System.out.println("Positive numbers = " + positiveNumbers + "\n" + "negative numbers = " + negativeNumbers + "\n" + "zero elements = " + zeroElements);
    }
}
