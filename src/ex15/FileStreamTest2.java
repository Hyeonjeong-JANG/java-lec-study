package ex15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileStreamTest2 {
    public static void main(String[] args) {
        byte[] list = new byte[6];
        try (FileInputStream out = new FileInputStream("D:\\workspace\\java_lec\\study\\src\\ex15\\test2.bin")) {
            out.read(list);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (byte b : list) {
            System.out.println(b + " ");
        }
        System.out.println();
    }
}
