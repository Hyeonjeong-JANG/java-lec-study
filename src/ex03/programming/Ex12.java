package ex03.programming;

import java.util.Scanner;

/**
 * 다음과 같이 학생들의 성적을 받아서 배열에 저장했다가 합계와 평균을 구하는 프로그램을 작성하라. -1이 입력되면 반복문을 종료한다.
 * 출력 예시
 * 성적을 입력하세요: 10
 * 성적을 입력하세요: 20
 * 성적을 입력하세요: 30
 * 성적을 입력하세요: -1
 * 합계: 60
 * 평균: 20.0
 */
public class Ex12 {
    public static void main(String[] args) {

        int count = 0;
        int totalScore = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("성적을 입력하세요: ");
            int score = sc.nextInt();
            count++;
            totalScore = totalScore + score;

            if (score < 0) {
                count = count - 1;
                totalScore = totalScore - score;
                break;
            }
        }
        System.out.println("합계: " + totalScore);
        System.out.println("평균: " + (double) totalScore / count);

    }
}
