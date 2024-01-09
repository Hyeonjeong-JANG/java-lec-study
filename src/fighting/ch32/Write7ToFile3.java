package fighting.ch32;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Write7ToFile3 {
    public static void main(String[] args) {
        try (OutputStream out = new FileOutputStream("data.dat")) {
            out.write(65);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
