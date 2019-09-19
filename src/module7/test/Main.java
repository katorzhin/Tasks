package module7.test;

import com.alibaba.fastjson.JSON;
import module7.homeWork.utils.FileUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static String file1 = "files/supply1.json";
    private static List<TestEntity> listSomthing = new ArrayList<>();
    public static String print(TestEntity entity) {
        String json = JSON.toJSONString(entity);
        System.out.println(json);
        return json;

    }

    public static void addSomething(String patchToJsonFile) throws IOException {
        String json;
        json = FileUtils.readFromFile(patchToJsonFile);
        listSomthing.addAll(JSON.parseArray(json,TestEntity.class));
        System.out.println("TestEntity are loaded from " + patchToJsonFile);
    }

    public static void main(String[] args) throws IOException {
      CreateJson createJson = new CreateJson();
        System.out.println();
        addSomething(file1);
        }

    }

