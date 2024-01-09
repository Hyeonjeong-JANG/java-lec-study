package ex15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * 상대 경로: 실행되는 위치(내 파일(.class))를 위치를 기반으로 경로를 정하는 것
 * 절대 경로: 루트에서부터 경로를 찾는 것
 * 윈도우에서 파일을 찾을 때: C:\\workspace\\hello.txt
 * 맥, 리눅스에서 파일을 찾을 때: /workspace/hello.txt
 * <p>
 * System.out.println("안녕, 난 \"홍길동\"이야."); // \을 쓰면 그 뒤에 나오는 하나의 문자를 문법이 아닌 그냥 문자로 취급한다.
 * System.out.println("C:\\workspace\\hello.txt"); // \를 하나만 쓰면 w와 h가 파일 경로가 아닌 그냥 문자로 취급되어서 경로를 제대로 읽을 수 없다.
 */

public class StreamEx05 {
    public static void main(String[] args) {
        try {
            // BufferedReader br = new BufferedReader(new FileReader("D:\\workspace\\java_lec\\study\\src\\ex15\\hello.txt"));
            BufferedReader br = new BufferedReader(new FileReader("src\\ex15\\hello.txt")); // 실행되는 위치가 study이기 때문에 src부터 쓴다.
            // new BufferedReader() 괄호 사이에 있는 new FileReader("src\\ex15\\hello.txt")가 타겟이다.
            String line = br.readLine();
            System.out.println("BufferedReader로 불러온 것: " + line);
            BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\workspace\\java_lec\\study\\src\\ex15\\input.txt", true)); // true를 하면 덮어씌워짐
            bw.write("안녕");
            bw.write("반가워\n");
            bw.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}