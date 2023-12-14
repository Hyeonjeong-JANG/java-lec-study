package ex03;

import java.util.Scanner;

// 사용자가 입력한 점수들의 평균을 내는 프로그램을 만든다. 음수가 입력되면 break에 의해 프로그램 종료! while로!
public class Averager {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while (true) {
            System.out.print("점수를 입력하시오: ");
            int userScore = sc.nextInt();
//        System.out.println(userScore);
            count++;
            System.out.println("몇 명?" + count);
            sum = sum + userScore;
            System.out.println("합계?" + sum);
            if (userScore < 0) {
                sum = sum - userScore;
                System.out.println("음수를 뺀 합계?" + sum);
                System.out.println("평균은 " + (sum / (count - 1)));
                break;
            }
        }


    }
}
