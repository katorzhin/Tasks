package noughtsAndCrosses;

import java.io.FileWriter;
import java.io.IOException;

import static noughtsAndCrosses.NoughtsAndCrosses.searchWinner;

public class CSVLogger {
    private String  fileName;
    public CSVLogger(String fileName) {
        try {
            this.fileName=fileName;
            clearFile();
            setHeader();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void setHeader() throws IOException {
        FileWriter fw =new FileWriter(fileName, true);
        fw.append("Player");
        fw.append(",");
        fw.append("TURN");
        fw.append("\n");
        fw.flush();
        fw.close();
    }

    public void logToFile(String turn, char currentPlayer) throws IOException {
        FileWriter fw =new FileWriter(fileName, true);
        fw.append(currentPlayer);
        fw.append(",");
        fw.append(turn);
        fw.append("\n");
        fw.flush();
        fw.close();
    }

    public void clearFile() throws IOException {
        FileWriter fw =new FileWriter(fileName);
        fw.append("");
        fw.flush();
        fw.close();
    }
}
