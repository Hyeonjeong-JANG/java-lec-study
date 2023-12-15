package ex03.exercise;

import java.util.Scanner;

// 다음의 작업을 수행하는 문장을 작성하라.
public class Ex01 {
    public static void main(String[] args) {
        // 1. 20 이상이고 60 미만이면 count를 증가한다.
        Scanner sc = new Scanner(System.in);

        int count = 0;
        while (true) {
            System.out.println("정수를 입력하세요.");
            int userNum = sc.nextInt();
            if (userNum >= 20 && userNum < 60) {
                count++;
                System.out.println(count);
            }

            if (userNum < 0) {
                break;
            }
        }
        System.out.println(count);
        // 2. x와 y 중에서 큰 값을 max에 저장하고 작은 값을 min에 저정한다.

        // 3. x가 1부터 20사이에 있으면 x의 값을 y에 대입한다.
    }
}
