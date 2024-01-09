package ex15;

import java.io.*;

public class DataStreamTest {
    public static void main(String[] args) throws IOException {
        DataInputStream in = null;
        DataOutputStream out = null;
        try {
            out = new DataOutputStream(new FileOutputStream("D:\\workspace\\java_lec\\study\\src\\ex15\\data.bin"));
            out.writeInt(123);
            out.writeFloat(123.456F);
            out.close();

            in = new DataInputStream(new FileInputStream("D:\\workspace\\java_lec\\study\\src\\ex15\\data.bin"));
            int aint = in.readInt();
            float afloat = in.readFloat();
            System.out.println(aint);
            System.out.println(afloat);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }

    }
}
