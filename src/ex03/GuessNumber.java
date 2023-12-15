package ex03;

import java.util.Scanner;

/**
 * 프로그램이 가지고 있는 정수를 사용자가 알아맞히는 게임이다.
 * 사용자가 답을 제시하고 프로그램은 자신이 정한 수와 비교하여 제시된 정수가 더 높은지 낮은지만을 알려준다.
 * 정수의 범위 1~100로 하면 최대 7번이면  맞힐 수 있고
 * 1~1000000까지 확대하면 20번이면 맞힐 수 있는데...
 * 오키 그런 프로그램을 만들어 보자.
 */
public class GuessNumber {
    public static void main(String[] args) {

        // 난수 추출하기
        int comNum = (int) (Math.random() * 100); // (Math.random() * 100) 이렇게 감싸지 않으면 0만 나온다.

//        System.out.println(comNum);

        // 사용자로부터 숫자 받기
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하시오: ");
        int userNum = sc.nextInt();
//        int count = 0;
        // 숫자 비교하기

        while (true) {

            if (comNum > userNum) {
                System.out.println("더 큰 숫자를 입력하세요.");
                userNum = sc.nextInt();
//                count++;
//                System.out.println(count + 1); // 왜 카운트가 제대로 되지 않지
            } else if (comNum < userNum) {
                System.out.println("더 작은 숫자를 입력하세요.");
                userNum = sc.nextInt();
//                count++;
//                System.out.println(count + 1);

            } else {
//                System.out.println("정답입니다. 당신은 " + count + 1 + "번만에 정답을 맞췄습니다.");
                System.out.println("정답입니다.");

                break;
            }


        }


    }
}
