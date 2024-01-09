package ex17.oneway;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

// 단방향
public class Client {
    public static void main(String[] args) {
        try {
            // localhost = 127.0.0.1(루프백)
            Socket socket = new Socket("127.0.0.1", 10000); // 이 소켓이 버퍼드 라이터의 타겟이 되는 것이다.
//            Scanner sc = new Scanner(System.in);
//            String msg = sc.nextLine();
            String msg1 = "ㅎ후후";
            String msg2 = "헤헤헤";
            // 가나다라abc
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8));
            // 소켓도 방향이 있는데 줄건지 받을건지를 체크하고 하자.
            // 버퍼드리더한테 나 인코딩이 유티에프8이야. 그렇게 끊어 읽어. 라고 말해주는 것이다. 오에스한테도 그렇게 말하는 것이다.

            bw.write(msg1 + "\n");
            bw.write(msg2);
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
