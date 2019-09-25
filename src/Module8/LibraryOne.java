package Module8;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class LibraryOne {
    private static Semaphore semaphore;
    private static int peopleCount;
    private static int maxAmount;
    Random random;

    public static void library() throws InterruptedException {
        semaphore = new Semaphore(maxAmount);
        System.out.println(Thread.currentThread().getName() + " пришел ко входу в библиотеку.");
        if (semaphore.availablePermits()==0){
            System.out.println(Thread.currentThread().getName()+"<-этот чувак ждет:)");
        }
        semaphore.acquire();
        System.out.println(Thread.currentThread().getName() + " entered the library");

        System.out.println(Thread.currentThread().getName() + " reading book");
        Random random=new Random();
      Thread.sleep(random.nextInt(4001) + 1000);
        semaphore.release();
        System.out.println(Thread.currentThread().getName() + " left the library");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter people count:");
        peopleCount = scanner.nextInt();
        System.out.println("Enter max amount of people that can be in the library:");
        maxAmount = scanner.nextInt();
        for (int i = 1; i < peopleCount; i++) {

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        library();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
            System.out.println(Thread.currentThread().getName()+" поток создан - "+i);
        }
    }
}