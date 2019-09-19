package module7.test;

import com.alibaba.fastjson.JSON;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreateJson {
    public CreateJson() throws IOException {
        generateSupplyFiles();
        System.out.println("\nFinish creating JSON files");

    }
    private void generateSupplyFiles() throws IOException {
        for (int i = 0; i < 2; i++) {
            List<TestEntity>list= new ArrayList<>();
            list.add(new TestEntity(TestEntity.TypeCar.sedan,"Daewoo",215000));
            list.add(new TestEntity(TestEntity.TypeCar.sedan,"Lada",200000));
            list.add(new TestEntity(TestEntity.TypeCar.sedan,"Ford",180000));
            String json = JSON.toJSONString(list);
            FileUtils.writeToFile(json,"files/supply1.json");
        }
    }
}
