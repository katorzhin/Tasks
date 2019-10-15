package module7.myHomeWork.utilities;

import java.io.*;

public class InputOutputFile {
    public static void writeToFile(String fileName, String json) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
        fileWriter.write(json);
        fileWriter.flush();
        fileWriter.close();
    }

    public static String readFromFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String json = reader.readLine();
        return json;
    }

}
