package ex02.test;

import java.util.Scanner;

public class FtoC3Test {
    public static void main(String[] args) {
        System.out.println("=======================");
        System.out.println("1. 화씨->섭씨");
        System.out.println("2. 섭씨->화씨");
        System.out.println("=======================");
        System.out.println();// 한 줄 띄워져
        System.out.println("번호를 선택하시오: 1");
        System.out.println("화씨온도를 입력하시오: 100.0");
        System.out.println("섭씨온도는 37.78");

        Scanner sc = new Scanner(System.in);
        System.out.print("섭씨 온도를 입력하시오: ");

        // 1. 섭씨 온도 받기
        double temp = sc.nextDouble();
//        System.out.println(temp);

        // 2. 섭씨 -> 화씨 온도로 변환
        double result = temp * 9.0 / 5.0 + 32.0;
        System.out.println("화씨 온도는 " + result);
    }
}
