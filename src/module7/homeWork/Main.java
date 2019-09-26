package module7.homeWork;


import com.alibaba.fastjson.JSON;
import module7.homeWork.utilities.CreateJson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static String file1 = "files/supply1.json";


    public static void main(String[] args) throws IOException {

//        fruits.add(new Fruit(Fruit.TypeFruit.apple,21,"11/09/2019",22));
//        fruits.add(new Fruit(Fruit.TypeFruit.banana,10,"10/07/2019",70));
//        String json = JSON.toJSONString(fruits);
        CreateJson createJson = new CreateJson();
        createJson.addSupply();
        TradeShop shop = new TradeShop();
        shop.addFruits(file1);
//        System.out.println("\n"+json);

    }
}
