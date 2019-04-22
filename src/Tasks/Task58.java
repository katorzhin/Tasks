package Tasks;

public class Task58 {
    public static void main(String[] args) {
        /*
        Дан массив из n четырехзначных натуральных чисел.
        Вывести на экран только те, у которых сумма первых двух цифр равна сумме двух последних.
         */
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int count = 0;
        int[] array1 = {5, 6, 7, 8, 9};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array[i] == array1[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}