package module7.homeWork.utilities;

import com.alibaba.fastjson.JSON;
import module7.homeWork.Fruit;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreateJson {


    public static void addSupply() throws IOException {
        List<Fruit> fruits = new ArrayList<>();



            fruits.add(new Fruit(Fruit.TypeFruit.apple, 21, "11/09/2019", 22));
            fruits.add(new Fruit(Fruit.TypeFruit.banana, 10, "10/07/2019", 70));
            String json = JSON.toJSONString(fruits);
            System.out.println("\n" + json);
            InputOutputFile.writeToFile("files/supply1.json", json);
        }
    }

