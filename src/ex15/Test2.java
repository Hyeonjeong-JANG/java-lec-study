package ex15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("D:\\workspace\\java_lec\\study\\src\\ex15\\data.bin");
            byte b = (byte) in.read();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
