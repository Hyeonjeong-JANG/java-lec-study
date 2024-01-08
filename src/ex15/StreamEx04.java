package ex15;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class StreamEx04 {
    public static void main(String[] args) {
        // 키보드가 아니라 모니터에 쓰고 싶다!!
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            bw.write("안녕\n");
            bw.write("반가워\n"); // 통신에서 \n는 내려쓰기를 하려는 목적이 아니라 읽을 때 반드시 readLine()으로 읽기 때문에 \n을 '꼭' 써줘야 한다. 안 쓰면 버퍼에 있는 것을 꺼내오지를 못 해.
            bw.flush(); // 버퍼가 꽉 차지 않았기 때문에 flush()를 해줘야 한다.
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
