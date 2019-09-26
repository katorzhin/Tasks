package module8;

import java.util.Random;
import java.util.concurrent.Semaphore;


public class LibraryOne {
    private int peopleCount;
    private int maxAmount;
    private final Semaphore semaphore;

    public LibraryOne(int peopleCount, int maxAmount) {
        this.peopleCount = peopleCount;
        this.maxAmount = maxAmount;
      semaphore = new Semaphore(maxAmount, true);
    }

    public void startThread() throws InterruptedException {
        for (int i = 1; i <= peopleCount; i++) {
            new Thread(new People(i)).start();
            Thread.sleep(500);

        }
    }


    public class People implements Runnable {
        private int peopleNumber;


        public People(int peopleNumber) {
            this.peopleNumber = peopleNumber;
        }

        @Override
        public void run() {

            System.out.printf("Person №%d came to the entrance of the library.\n", peopleNumber);
            try {
                if (semaphore.availablePermits()==0) {
                    System.out.printf("Person №%d waiting at the entrance to the library.\n", peopleNumber);
                }
                semaphore.acquire();
                System.out.printf("Person №%d entered the library.\n", peopleNumber);

                System.out.printf("Person №%d reading book.\n", peopleNumber);


                Random random = new Random();
                Thread.sleep(random.nextInt(4001) + 1000);
                semaphore.release();
                System.out.printf("Person №%d left the library \n", peopleNumber);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
