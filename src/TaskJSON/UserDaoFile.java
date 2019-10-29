package TaskJSON;

import com.alibaba.fastjson.JSON;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoFile implements UserDao<User> {

public static void writeToFile(String path,String json) throws IOException {
    FileWriter fileWriter = new FileWriter(path);
    fileWriter.write(json);
    fileWriter.flush();
    fileWriter.close();
}

    public static void main(String[] args) throws IOException {
    List <User> users = new ArrayList<>();

        String json = JSON.toJSONString(users);
        writeToFile("test.json",json);
        System.out.println(json);
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User getById(long id) {
        return null;
    }

    @Override
    public void add(User user) {

    }

    @Override
    public void delete(long id) {

    }
}
