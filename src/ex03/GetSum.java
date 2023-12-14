package ex03;

import java.util.Scanner;

// -1의 값이 입력될 떄까지 사용자가 입력한 정수의 합계를 계산하여 합계를 출력하자.
public class GetSum {
    public static void main(String[] args) {
        // 값 입력 받고 뽑아내기(?)
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("정수를 입력하세요: ");
            int userNum = sc.nextInt();
//            System.out.println(userNum);
            sum = sum + userNum;

            if (userNum == -1) {
                System.out.println("정수의 합은 " + (sum + 1) + "입니다.");
                break;
            }
        }
//        System.out.println(sum);

    }
}
