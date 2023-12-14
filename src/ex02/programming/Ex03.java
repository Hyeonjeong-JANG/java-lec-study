package ex02.programming;

import java.util.Scanner;

/**
 * 사용자로부터 두 개의 정수를 받아서 정수의 합, 정수의 차, 정수의 곱, 정수의 평균, 큰 수, 작은 수를 계산하여 화면에 출력하는 프로그램을 작성하라. 큰 수와 작은 수를 구할 때는 조건 연산자를 사용해보자.
 * x: 10
 * y: 20
 * 출력 형태
 * 두 수의 합: 30
 * 두 수의 차: -10
 * 두 수의 곱: 200
 * 두 수의 평균: 15.0
 * 큰 수: 20
 * 작은 수: 10
 */
public class Ex03 {
    public static void main(String[] args) {
        // 사용자로부터 두 개의 정수 받기
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력하시오: ");
        int x = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하시오: ");
        int y = sc.nextInt();
//        System.out.println(x + " " + y);
        System.out.println("두 수의 합: " + (x + y));
        System.out.println("두 수의 차: " + (x - y));
        System.out.println("두 수의 곱: " + (x * y));
        double avg = (x + y) / 2;
        System.out.println("두 수의 평균: " + avg);
        int bigNum = (x > y == true) ? x : y;
        System.out.println("큰 수: " + bigNum);
        int smallNum = (x < y == true) ? x : y;
        System.out.println("작은 수: " + smallNum);
    }
}
