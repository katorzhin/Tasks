package module7.test;

import com.alibaba.fastjson.JSON;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static String file1 = "files/supply1.json";
    private static List<TestEntity> listSomthing = new ArrayList<>();



    private static void generateSupplyFiles() throws IOException {
        for (int i = 0; i < 5; i++) {

            listSomthing.add(new TestEntity(215000, "Daewoo", TestEntity.TypeCar.sedan));
//            list.add(new TestEntity("Lada",TestEntity.TypeCar.sedan,200000));
//            list.add(new TestEntity("Ford",TestEntity.TypeCar.sedan,180000));
            String json = JSON.toJSONString(listSomthing);
            FileUtils.writeToFile(json, "files/supply1.json");
        }
    }

    public static void addSomething(String patchToJsonFile) throws IOException {
        String json = FileUtils.readFromFile(patchToJsonFile);
        listSomthing.addAll(JSON.parseArray(json, TestEntity.class));
        System.out.println("TestEntity are loaded from " + patchToJsonFile);
    }

    public static void main(String[] args) throws IOException {
//      CreateJson createJson = new CreateJson();
        System.out.println();
        generateSupplyFiles();
//        addSomething(file1);
    }

}

