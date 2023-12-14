package ex02.programming;

import java.util.Scanner;

/**
 * 정수(최대 2자리)를 2진수로 변환하여 출력하는 프로그램을 작성해보자.
 * 출력 형태
 * 정수: 127
 * 127: 1111111
 */
public class Ex09 {
    public static void main(String[] args) {
        // 정수 입력 받기
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하시오.");
        int num = sc.nextInt();
        int rest = num;
        // 2진수로 변경하는 계산 만들기, 배열 안 배웠고 반복문 없이 만들기, 이프문도 안 배움
        // 숫자를 2로 나눠서 몫도 없고

        int bi1 = num % 2;
        rest = rest / 2;
//        System.out.println(bi1);
//        System.out.println(rest);

        int bi2 = rest % 2;
        rest = rest / 2;
//        System.out.println(bi2);
//        System.out.println(rest);

        int bi3 = rest % 2;
        rest = rest / 2;
//        System.out.println(bi3);
//        System.out.println(rest);

        int bi4 = rest % 2;
        rest = rest / 2;
//        System.out.println(bi4);
//        System.out.println(rest);

        int bi5 = rest % 2;
        rest = rest / 2;
//        System.out.println(bi5);
//        System.out.println(rest);

        int bi6 = rest % 2;
        rest = rest / 2;
//        System.out.println(bi6);
//        System.out.println(rest);

        int bi7 = rest % 2;
        rest = rest / 2;
//        System.out.println(bi7);
//        System.out.println(rest);

        // 8까지는 필요 없음
//        int bi8 = rest % 2;
//        rest = rest / 2;
//        System.out.println(bi8);
//        System.out.println(rest);

        System.out.println(num + ": " + bi7 + "" + bi6 + "" + bi5 + "" + bi4 + "" + bi3 + "" + bi2 + "" + bi1);
    }
}
