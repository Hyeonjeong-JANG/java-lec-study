package ex15.copy;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile1 {
    public static void main(String[] args) throws IOException {
        FileReader in = new FileReader("D:\\workspace\\java_lec\\study\\src\\ex15\\test.txt");
        FileWriter out = new FileWriter("D:\\workspace\\java_lec\\study\\src\\ex15\\copy2.txt");
        try (in; out) {
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
