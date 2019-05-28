package tamagochi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //главная функция. сздаем обьект тамагочи
        Tamagochi tamagochi = new Tamagochi();
        //тамагочи являеться объектом-потоком. в целом это не правильно, но для теста то что надо
        Thread thread = new Thread(tamagochi);
        thread.start();
        someDoing(thread, tamagochi);
    }

    private static void someDoing(Thread tamagochiLive, Tamagochi tamagochi) {
        //тут используеться магия считывания с консоли и оператор switch
        System.out.println("1.give toilet");
        System.out.println("2.give eat");
        System.out.println("3.give play");
        System.out.println("4.give sleep");
        Scanner scanner = new Scanner(System.in);
        while (tamagochiLive.isAlive()) {
            try {
                int result = scanner.nextInt();
                scanner.nextLine();
                switch (result) {
                    case 1:
                        tamagochi.setToilet();
                        break;
                    case 2:
                        tamagochi.setEat();
                        break;
                    case 3:
                        tamagochi.setPlay();
                        break;
                    case 4:
                        tamagochi.setSleep();
                        break;
                }

            } catch (Exception e) {
                System.out.println("nonononooo!");
            }
        }
    }
}