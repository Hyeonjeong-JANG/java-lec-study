package ex02;

import java.util.Scanner;

public class FtoC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("섭씨 온도를 입력하시오: ");

        // 1. 섭씨 온도 받기
        double temp = sc.nextDouble();
//        System.out.println(temp);
        
        // 2. 섭씨 -> 화씨 온도로 변환
        double result = temp *9.0 / 5.0 + 32.0;
        System.out.println("화씨 온도는 " + result);
    }
}
