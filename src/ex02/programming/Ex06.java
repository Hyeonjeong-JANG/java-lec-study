package ex02.programming;

import java.util.Scanner;

/**
 * 사용자로부터 파일이 위치한 드라이브 이름(c), 디렉터리 이름(\test\), 파일이름(sample), 확장자(py)를 받아서 완전한 파일 이름(c:\test\sample.py)으로 만드는 프로그램을 작성해 보자.
 * 출력 형태
 * 드라이브 이름: c
 * 디렉터리 이름: \test\
 * 파일 이름: sample
 * 확장자: py
 * <p>
 * 완전한 이름은 c:\test\sample.py
 */
public class Ex06 {
    public static void main(String[] args) {
        //사용자로부터 각각의 이름을 받기
        Scanner sc = new Scanner(System.in);
        System.out.print("드라이브 이름: ");
        String drive = sc.nextLine();
//        System.out.println(drive);
        System.out.print("디렉터리 이름: ");
        String dir = sc.nextLine();
//        System.out.println(dir);
        System.out.print("파일 이름: ");
        String file = sc.nextLine();
//        System.out.println(file);
        System.out.print("확장자: ");
        String ex = sc.nextLine();
//        System.out.println(ex);
        System.out.println();
        System.out.println("완전한 이름은 " + drive + ":" + dir + file + "." + ex);
    }
}
