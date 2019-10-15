package module8;

import java.util.Scanner;

public class MyScanner {
    private int peopleCount;
    private int maxAmount;

    public MyScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of visitors to the library:");
        peopleCount = scanner.nextInt();
        System.out.println("Enter the contents of the library:");
        maxAmount = scanner.nextInt();
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public int getMaxAmount() {
        return maxAmount;
    }
}
