package ex15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {

        try (FileReader fr = new FileReader("D:\\workspace\\java_lec\\study\\src\\ex15\\test.txt");) {
            int ch = 0;
            while ((ch = fr.read()) != -1) {
                System.out.println((char) ch + " ");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
