package ex17;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SocketTest {
    public static void main(String[] args) {
        try (Socket s = new Socket("time-c.nist.gov", 13)) {
            InputStream inputStream = s.getInputStream();
            Scanner in = new Scanner(inputStream);

            while (in.hasNextLine()) {
                String line = in.nextLine();
                System.out.println(line);
            }
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
