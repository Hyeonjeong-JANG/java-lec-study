package ex17.multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Server {
    public static void main(String[] args) {
        try {
            // 1. 소켓과 버퍼 만들기
            ServerSocket serverSocket = new ServerSocket(20000);
            Socket socket = serverSocket.accept(); // accept()
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true, StandardCharsets.UTF_8);

            // 2. 메시지 받기 스레드
            new Thread(() -> {
                while (true) {
                    String requestMsg = null;
                    try {
                        requestMsg = br.readLine();
                        System.out.println("클라이언트로부터 받은 메시지: " + requestMsg);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
