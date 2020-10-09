import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        writeToFile("Hello!");
        writeToFile("My name is Boris");
        writeToFile("Hello, Boris!");
        writeToFile("My name is Felix");
        writeToFile("Hello everybody!");
        writeToFile("My name is Barsik");
        writeToFile("Hello, Barsik!");
        writeToFile("Where is Murka?");

        readFromFile();
    }

    static void writeToFile (String line) {
        try (FileWriter fw = new FileWriter("history_boris.txt", true)) {
            fw.write(line + "\n");
        } catch (Exception e) {
            throw new RuntimeException("Something went wrong", e);
        }
    }

    static void readFromFile () {
        try (BufferedReader br = new BufferedReader(new FileReader("history_boris.txt"))){
            List<String> allLines = new ArrayList<>();
            String str;
            while ((str = br.readLine()) != null) {
                allLines.add(str);
            }

            List<String> lastLines = new ArrayList<>();
            for (int i = allLines.size() - 5; i < allLines.size(); i++) {
                lastLines.add(allLines.get(i));
            }
            System.out.println(lastLines);
        } catch (Exception e) {
            throw new RuntimeException("Something went wrong", e);
        }
    }
}
