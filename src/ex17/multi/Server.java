package ex17.multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

class T1 extends Thread {

}

class T2 extends Thread {

}

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(15000);) {

            Socket socket = serverSocket.accept();

            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String requestMsg = br.readLine();
            System.out.println("클라이언트로부터 받은 메시지: " + requestMsg);
            Scanner sc = new Scanner(System.in);
            String serverMsg = sc.nextLine(); // 서버가 쓰는 메시지

            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true, StandardCharsets.UTF_8);
            pw.println(requestMsg); // 클라이언트가 보내는 메시지 출력
            pw.println(serverMsg);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
