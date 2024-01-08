package ex15;

import java.io.IOException;
import java.io.InputStreamReader;

public class StreamEx02 {
    public static void main(String[] args) {
        InputStreamReader ir = new InputStreamReader(System.in);
        // 얘는 배열을 만들 수 있어.
        char[] ch = new char[4]; // 버퍼가 아니라 보조 스트림

        try {
            ir.read(ch); //  ir은 키보드에 연결되어 있는데 그 객체는 ch라는 보조 스트림으로부터 데이터를 읽는다.
            for (char c : ch) {
                System.out.print(c + " ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
