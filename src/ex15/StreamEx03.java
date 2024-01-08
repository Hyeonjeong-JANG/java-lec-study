package ex15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamEx03 {
    public static void main(String[] args) {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        // Scanner도 버퍼로 만들어져서 내부에 InputStreamReader가 달려 있다.
        try {
            String line = br.readLine(); // 읽는 입장에서는 한 번에 \n까지만 읽어.
            System.out.println(line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
