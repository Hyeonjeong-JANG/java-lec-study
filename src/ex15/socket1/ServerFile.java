package ex15.socket1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerFile {
    ServerSocket serverSocket;
    Socket socket;
    BufferedReader br;

    public ServerFile() throws IOException {
        System.out.println("1. 서버 소켓 시작----------------------------------");
        try {
            serverSocket = new ServerSocket(10000);
            System.out.println("2. 서버 소켓 생성 완료: 클라이언트 접속 대기 중----------------------------------");
            socket = serverSocket.accept(); // 클라이언트 접속 대기중...
            System.out.println("3. 클라이언트 연결 완료 완료----------------------------------");

            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String msg = br.readLine();
            System.out.println("4. 클라이언트로부터 받은 메시지: " + msg);
        } catch (Exception e) {
            System.out.println("서버 소켓 에러 발생함: " + e.getMessage());
        }
    }

    public static void main(String[] args) throws IOException {
        new ServerFile();
    }
}
