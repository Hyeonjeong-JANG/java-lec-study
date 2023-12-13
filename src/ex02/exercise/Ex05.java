package ex02.exercise;

import java.util.Scanner;

/**
 * 사용자가 번개로부터 얼마나 멀리 떨어져 있는지를 계산하는 프로그램을 만들어 보자. 소리는 공기를 통해 초당 약 340m를 이동한다. 빛은 초당 300,000km를 이동한다. 번개를 본 시간과 소리가 도달하는 시간 사이의 간격을 알면 번개까지의 거리를 계산할 수 있다. 시간 간격은 사용자로부터 입력받는다.
 * 출력 형태
 * 시간간격을 입력하시오(단위: 초): 7
 * 번개가 발생한 곳까지의 거리: 2100m
 */
public class Ex05 {
    public static void main(String[] args) {
        // 시간 간격 입력받기
        System.out.print("시간간격을 입력하시오(단위: 초): ");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
//        System.out.println(t);

        // 번개가 발생한 곳까지의 거리 계산
        // 1초에 340미터니까 단순 계산하면 이렇게 됨.
        int d = t * 340;
        System.out.println(d); // 2380이야. 280은 어디에서 왔을까?

    }
}
