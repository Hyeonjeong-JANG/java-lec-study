package ex15;

import java.io.IOException;
import java.io.InputStream;

public class StreamEx01 {
    public static void main(String[] args) {
        InputStream input = System.in; //  키보드로부터 입력
        // 하드디스크 입장에서 인풋은 안쪽으로 들고 온다 이거야.
        // 바이트 스트림은 1바이트씩만 들어가서 ab를 쓰면 a만 들어간다.
        try {// 알트 엔터
            int value = input.read();
            System.out.println("받은 값: " + (char) value);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
