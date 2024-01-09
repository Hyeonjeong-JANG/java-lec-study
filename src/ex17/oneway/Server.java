package ex17.oneway;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

// 통신을 하는데 버퍼가 안 달린 것은 없다.
public class Server {
    public static void main(String[] args) {
        try {
            // 데이터가 컴퓨터까지 도착하는 것은 IP를 통해서지만 카톡인지 네이트온인지 알 수 있는 것은 포트 번호 때문이다. 그게 아래에 적힌 10000
            ServerSocket serverSocket = new ServerSocket(10000);
            System.out.println("ServerSocket 연결됨");
            Socket socket = serverSocket.accept(); // 누가 나에게 요청하는지를 확인하는 리스너
            System.out.println("클라이언트 연결됨");

            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
            while (true) {
                String msg = br.readLine();
                if (msg == null) {
                    break;
                }
                System.out.println(msg);
            }

            /**
             * 왜 소켓을 두 개 만드냐?
             * ServerSocket: 연결용. 연결되고 나면 이 선을 끊고 Socket으로 선을 새로 만들어서 연결한다.
             * 왜? 서버라는 것은 한 명의 요청만 받는 것이 아닌데 한 번에 한 명의 요청만 받을 수 있다. 서버소켓이 계속 연결되어 있으면 다른 사람의 요청을 들을 수가 없어. 그래서 소켓을 새로 만들어.
             * 그래서 스레드가 필요하다.
             * 스레드는 리스너에 하나 + 연결된 클라이언트 숫자만큼!! n+1
             * Socket: 진짜루 얘로 통신함. 얘의 포트번호는 랜덤이야. 신경쓰지말어.
             */
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
