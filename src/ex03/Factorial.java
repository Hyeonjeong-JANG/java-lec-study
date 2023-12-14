package ex03;

import java.util.Scanner;

/**
 * 팩토리얼 값을 계산하자!
 * 20!을 구해보자!
 */
public class Factorial {
    public static void main(String[] args) {
        long fact = 1;
        int n;
        System.out.println("정수를 입력하시오: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
//        System.out.println(n);

        for (int i = 0; i < n; i++) {
            fact = fact * (i + 1);
        }
        System.out.println(fact);
    }
}
