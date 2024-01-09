package fighting.ch32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Read7FromFile {
    public static void main(String[] args) throws FileNotFoundException {
        InputStream in = new FileInputStream("data.dat");
        try {
            int dat = in.read();
            in.close();
            System.out.println(dat);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
