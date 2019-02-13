package Tests;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Введите А: ");
        int a = scanner.nextInt();
        int [] numbers= new int[a];

        System.out.println("Введите B: ");
        int b = scanner.nextInt();

        System.out.println(b+" "+a);
    }

}
