package ex15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample2 {
    public static void main(String[] args) {
        FileReader fr;
        try {
            fr = new FileReader("D:\\workspace\\java_lec\\study\\src\\ex15\\test.txt");
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch + " ");
            }
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
