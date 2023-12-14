package ex03;

import java.util.Scanner;

/**
 * 사용자로부터 양의 정수를 입력받아서 그 정수의 모든 약수를 출력하는 프로그램을 작성해보자.
 * 출력 형식
 * 양의 정수를 입력하시오: 100
 * 100의 약수는 다음과 같습니다.
 * 1 2 4 5 10 20 25 50 100
 */
public class Divisor {
    public static void main(String[] args) {

        // 정수를 입력 받기
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하시오: ");
        int userNumber = sc.nextInt();
//        System.out.println(num);

        // 입력된 정수의 약수를 구하기
        System.out.print(userNumber + "의 약수는 ");
        for (int i = 1; i <= userNumber; i++) {
            int divNum = i;
            if (userNumber % divNum == 0) {
                System.out.print(divNum + " ");
            }

        }
        System.out.println("입니다.");
    }
}
