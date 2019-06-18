package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Double> hm = new HashMap<>();

        hm.put("Джон Доу", 3434.34);
        hm.put("Том Смит", 123.22);
        hm.put("Джейн Бейкер", 1378.00);
        hm.put("Тод Хол", 99.22);
        hm.put("Ральф Смит", -19.08);

        Set<Map.Entry<String, Double>> set = hm.entrySet();

        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + " : ");

            System.out.println(me.getValue());
            System.out.println();
            // внести сумму 1000 на счет Джона Доу
            double balance = hm.get("Джoн Доу");
            hm.put("Джoн Доу", balance + 1000);
            System.out.println(" Hoвый остаток на счете Джона Доу : " +
                    hm.get(" Джoн Доу"));
        }
    }
}