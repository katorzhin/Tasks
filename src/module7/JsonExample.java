package module7;

import com.alibaba.fastjson.JSON;
import module7.entity.DogEntity;

public class JsonExample {
    static String serializeObject(DogEntity dog){
        String json = JSON.toJSONString(dog);
        System.out.println(json);
        return json;
    }
    static DogEntity parseFromJson(String json){
        DogEntity dog = JSON.parseObject(json,DogEntity.class);
        return dog;
    }

    public static void main(String[] args) {


    }
}
