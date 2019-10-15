package module7.myHomeWork.utilities;

import com.alibaba.fastjson.JSON;
import module7.myHomeWork.Car;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreateJson {
    public CreateJson() throws IOException {
        generate();
        System.out.println("\nfinish creating JSON files.");
    }
    public void generate() throws IOException {
        for (int i = 0; i < 3; i++) {
            List<Car> list = new ArrayList<>();
            list.add(new Car("Daewoo","Nexia",Car.BodyCar.Sedan,215000,2008));
            list.add(new Car("Daewoo","Lanos",Car.BodyCar.Sedan,180000,2003));
            list.add(new Car("Hyudai","i30",Car.BodyCar.Sedan,100000,2010));
            String json = JSON.toJSONString(list);
            InputOutputFile.writeToFile("files/supply1.json",json);
        }
    }
}
