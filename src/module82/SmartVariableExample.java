package lesson9;

import java.util.Scanner;

public class SmartVariableExample {
    static String[] book = {
            "page 0: aaaaaaaaaaaaaaaaaaaaaaaaaa",
            "page 1: bbbbbbbbbbbbbbbbbbbbbbbbbb",
            "page 2: cccccccccccccccccccccccccc",
            "page 3: dddddddddddddddddddddddddd",
            "page 4: eeeeeeeeeeeeeeeeeeeeeeeeee",

    };
    static int countOfUpdates = 0;

    public static void main(String[] args) {
        SmartObject<Integer> page = new SmartObject<>();
        page.getOnUpdate().add(new Runnable() {
            @Override
            public void run() {
                System.out.println(book[page.getValue()]);
            }
        });


        Runnable runnableAnimation = () -> {
            System.out.println("Starting animation....  ");
        };

        Runnable onFifthUpdate = () -> {
            page.getOnUpdate().remove(runnableAnimation);
        };

        Runnable onUpdate = () -> {
            countOfUpdates++;
            if (countOfUpdates == 5)
                onFifthUpdate.run();
        };
        page.getOnUpdate().add(runnableAnimation);
        page.getOnUpdate().add(onUpdate);

        Scanner sc = new Scanner(System.in);

        while (true) {
            int userPage = sc.nextInt();
            page.setValue(userPage);
        }
    }
}
