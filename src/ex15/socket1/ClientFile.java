package ex15.socket1;

import java.io.*;
import java.net.Socket;

public class ClientFile {
    Socket socket;
    BufferedWriter bw;
    BufferedReader br;

    public ClientFile() {

        try {
            System.out.println("1. 클라이언트 소켓 시작----------------------------------");
            socket = new Socket("ip주소", 10000); // 이 라인 실행시 서버 소켓의 accept()메서드가 호출됨
            System.out.println("1. 버퍼(write) 연결완료----------------------------------");

            bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            String keyboardMsg = br.readLine();

            // 메시지의 끝을 알려줘야 한다. \n

            bw.write(keyboardMsg + "\n");
            bw.flush();

            // 키보드 연결
            br = new BufferedReader(new InputStreamReader(System.in));
        } catch (IOException e) {
            System.out.println("클라이언트 소켓 에러 발생함: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new ClientFile();

    }
}
