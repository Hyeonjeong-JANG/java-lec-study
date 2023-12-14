package ex02.programming;

import java.util.Scanner;

/**
 * 사용자로부터 구의 반지름을 입력받아서 부피를 계산하여 출력하는 프로그램을 작성하라. 단구의 반지름은 실수로 입력되면 출력도 모두 실수형으로 하여야 한다. 부피를 계산하는 수식은 4/3파이rrr이다.
 * 출력 형태
 * 구의 반지름: 5.0
 * 구의 부피: 166.666666666663
 */
public class Ex08 {
    public static void main(String[] args) {
        // 구의 반지름 입력 받기
        Scanner sc = new Scanner(System.in);
        System.out.println("구의 반지름을 입력하시오.");
        double r = sc.nextDouble();
//        System.out.println(radius);
        System.out.println("구의 반지름: " + r);

        // 구의 부피 구하기
//        double volume = Math.round(r * r * r * 4 / 3 * 1000000000) / 1000000000.0;// 마지막 숫자를 3으로 어떻게 하는지 모름
        double volume = Math.round(r * r * r * 4 / 3 * 1000000000) / 1000000000.0;
        System.out.println("구의 부피: " + volume);
    }
}
