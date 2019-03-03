package Tasks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Task5EvenNumbersOfSequence {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 34, 86};
        ArrayList<Integer> listOfNewNumber = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                listOfNewNumber.add(a[i]);
            }
        }
        if (listOfNewNumber.size() > 0) {
            System.out.println(listOfNewNumber);
        } else {
            System.out.println("не было целых чисел");
        }

    }
}