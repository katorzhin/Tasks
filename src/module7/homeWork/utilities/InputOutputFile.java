package module7.homeWork.utilities;

import com.alibaba.fastjson.JSON;

import java.io.FileWriter;
import java.io.IOException;

public class InputOutputFile {
    public static void writeToFile(String path, String json) throws IOException {
        FileWriter writer = new FileWriter(path);
        writer.write(json);
        writer.flush();
        writer.close();

    }

    public static void readFromFile() {

    }
}
