package ex17.half;

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
            ServerSocket serverSocket = new ServerSocket(20000); // socket(), bind(), listen()이 포함된 개념.
            Socket socket = serverSocket.accept(); // accept()
            // 소켓 연결 완료됨

            // 요청을 받아야만 응답하기 때문에 동기적 실행
            // 버퍼 만들기(received)
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String requestMsg = br.readLine();
            System.out.println("클라이언트로부터 받은 메시지: " + requestMsg);

            // 버퍼 만들기(send)
            // 버퍼드롸이터를 하면 인풋스트림리더 이런거 만들어야 하는데 프린트롸이터를 쓰면 그게 다 구현되어 있어서 쓰기 편하다.
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true, StandardCharsets.UTF_8);
            // OutputStream out, boolean autoFlush, Charset charset 차셋은 안 해도 됨.
            // protocol: 만들 수 있는 근거는 프로토콜 표
            if (requestMsg.equals("1")) {
                pw.println("영화"); // println() 아니고 print()를 하면 "\n"을 해줘야 함.
            } else if (requestMsg.equals("2")) {
                pw.println("드라마");
            } else {
                pw.println("프로토콜을 확인하세요: 1은 영화, 2는 드라마");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
