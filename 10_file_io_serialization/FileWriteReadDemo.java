import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteReadDemo {
    public static void main(String[] args) {
        String fileName = "sample.txt";
        FileWriter writer = null;
        BufferedReader reader = null;

        try {
            writer = new FileWriter(fileName);
            writer.write("Java File IO Demo\n");
            writer.write("Second line");
            writer.close();

            reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("IO error: " + e.getMessage());
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Close error: " + e.getMessage());
            }
        }
    }
}
