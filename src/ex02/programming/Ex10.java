package ex02.programming;

import java.util.Scanner;

/**
 * 움직이는 물체의 운동에너지를 계산해보자. 물체의 에너지를 계산하는 식은 0.5 * 무게 * 속도*속도이다. 적절한 자료형을 사용한다.
 * 출력 형태
 * 물체의 무게를 입력하시오(킬로그램): 100
 * 물체의 속도를 입력하시오(미터/초): 100
 * 물체는 500000.0 (줄)의 에너지를 가지고 있다.
 */
public class Ex10 {
    public static void main(String[] args) {
        // 물체의 무게와 속도 입력 받기
        Scanner sc = new Scanner(System.in);
        System.out.print("물체의 무게를 입력하시오(킬로그램): ");
        int weight = sc.nextInt();
//        System.out.println(weight);
        System.out.print("물체의 속도를 입력하시오(미터/초): ");
        int speed = sc.nextInt();
//        System.out.println(speed);

        double energy = 0.5 * weight * speed * speed;
        System.out.println("물체는 " + energy + " (줄)의 에너지를 가지고 있다.");
    }
}
