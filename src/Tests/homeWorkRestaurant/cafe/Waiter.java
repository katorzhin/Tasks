package tests.homeWorkRestaurant.cafe;

import java.util.Scanner;

public class Waiter {


    public void createOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.Борщ");
        System.out.println("2.Карпаччо из лосося");
        System.out.println("3.Пицца-заебицца");
        System.out.println("4.Десерт Brauni");
    }

    public void buildOrder(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Борщ");
                break;
            case 2:
                System.out.println("Карпаччо из лосося");
                break;
            case 3:
                System.out.println("Пицца-заебицца");
                break;
            case 4:
                System.out.println("Десерт Brauni");
                break;
            default:
                System.out.println("Wtf man?");
        }
    }
}
