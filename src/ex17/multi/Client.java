package ex17.multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 15000);) {
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);

            Scanner sc = new Scanner(System.in);
            String clientMsg = sc.nextLine(); // 서버가 쓰는 메시지
            pw.println(clientMsg);
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String responseMsg = br.readLine();
            System.out.println("서버로부터 받은 메시지: " + responseMsg);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
