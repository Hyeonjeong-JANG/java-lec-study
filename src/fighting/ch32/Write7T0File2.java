package fighting.ch32;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Write7T0File2 {
    public static void main(String[] args) throws IOException {
        OutputStream out = null;
        try {
            out = new FileOutputStream("data.dat");
            out.write(97);

        } finally {
            if (out != null) {
                out.close();
            }
        }

    }
}
