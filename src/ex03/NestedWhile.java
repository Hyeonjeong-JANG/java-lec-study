package ex03;

import java.util.Scanner;

// 양수, 음수, 0 판별하기(While)
public class NestedWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) { // 무한반복 되니까 이게 바로 데몬, 계산기는 한 번 실행되고 꺼지면 안 되자너. 그래서 while이 돌게 만들어야 한다.
            System.out.print("정수를 입력하시오: ");

            int number = sc.nextInt();
            if (number == 99) { // 데몬을 빠져나가는 것이 목적
                break;
            }

            if (number > 0) {
                System.out.println("양수입니다.");
            } else if (number < 0) {
                System.out.println("음수입니다.");
            } else {
                System.out.println("0입니다.");
            }
        }
    }
}
