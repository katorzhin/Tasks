import java.util.Scanner;

public class Riddle {
    public static void main(String[] args) {

        String answer;
        boolean exit=false;
        System.out.println("Что это такое: синий, большой, с усами и полностью набит зайцами?");
        Scanner inputAnswer=new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            if (exit == true) {
                break;
            }
                answer = inputAnswer.next();
                switch (answer) {
                    case ("Троллейбус"):
                        System.out.println("Правильно!");
                        exit = true;
                        break;
                    case ("сдаюсь"):
                        System.out.println("Правильный ответ: Троллейбус.");
                        exit = true;
                        break;

                    default:
                        System.out.println("Подумай еще:)");

                }

        }
    }
}
