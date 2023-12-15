package ex03.programming;

import java.util.Objects;
import java.util.Scanner;

/**
 * 간단한 계산기 프로그램을 작성하여 보자. 먼저 사용자로부터 하나의 문자를 입력받는다.
 * 이어서 사용자로부터 2개의 숫자를 입력받는다.
 * 사용자로부터 받은 문자가 '+'이면 두 수의 덧셈을, 문자가 '-'이면 뺄셈을,
 * 문자가 '/'이면 나눗셈을 수행하도록 작성하라. if_else문을 사용하라.
 * 나눗셈의 경우, 분모가 0이 아닌지를 먼저 검사하여야 한다.
 */
public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 연산 입력 받기
        System.out.print("연산을 입력하세요: ");
        String symbol = sc.nextLine();
//        System.out.println(symbol);

        // 숫자 입력 받기
        System.out.print("피연산자 2개를 입력하세요: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (Objects.equals(symbol, "+")) {
            System.out.println((double) num1 + num2);
        } else if (Objects.equals(symbol, "-")) {
            System.out.println((double) num1 - num2);
        } else if (Objects.equals(symbol, "*")) {
            System.out.println((double) num1 * num2);
        } else if (Objects.equals(symbol, "/")) {
            if (num2 != 0) {
                System.out.println((double) num1 / num2);
            } else if (num2 == 0) {
                System.out.println("분모가 0입니다. 다른 숫자를 입력해 주세요.");
                num2 = sc.nextInt();
                System.out.println((double) num1 / num2);
            }
        }
    }
}
