package Tasks;

public class Task59 {
    public static void main(String[] args) {
        /*
        Даны две последовательности целых чисел а1, а2, ..., аn и b1, b2, ..., bm. 
        Все члены последовательностей – различные числа. Найти, сколько членов первой последовательности 
        совпадают с членами второй последовательности.
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
