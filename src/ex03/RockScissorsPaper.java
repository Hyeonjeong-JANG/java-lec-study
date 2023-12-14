package ex03;

import java.util.Scanner;

/**
 * 가위, 바위, 보 게임
 * 가위(0), 바위(1), 보(2)
 * 한 판에 끝내기
 */
public class RockScissorsPaper {
    public static void main(String[] args) {
        // 가위, 바위, 보 선언하기
        int rock = 0;
        int scissors = 1;
        int paper = 2;
        // user 선택 받기
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 선택해 주세요! 가위(0), 바위(1), 보(2)");
        int user = sc.nextInt();
//        System.out.println(user);
        int computer = (int) (Math.random() * 3);
        if (user == computer) {
            System.out.println("컴퓨터가 선택한 숫자는 " + computer + "입니다.");
            System.out.println("비겼습니다.");
        } else if (user == 0 && computer == 1) {
            System.out.println("컴퓨터가 선택한 숫자는 " + computer + "입니다.");
            System.out.println("컴퓨터가 이겼습니다.");
        } else if (user == 0 && computer == 2) {
            System.out.println("컴퓨터가 선택한 숫자는 " + computer + "입니다.");
            System.out.println("당신이 이겼습니다.");
        } else if (user == 1 && computer == 0) {
            System.out.println("컴퓨터가 선택한 숫자는 " + computer + "입니다.");
            System.out.println("당신이 이겼습니다.");
        } else if (user == 1 && computer == 2) {
            System.out.println("컴퓨터가 선택한 숫자는 " + computer + "입니다.");
            System.out.println("컴퓨터가 이겼습니다.");
        } else if (user == 2 && computer == 0) {
            System.out.println("컴퓨터가 선택한 숫자는 " + computer + "입니다.");
            System.out.println("컴퓨터가 이겼습니다.");
        } else if (user == 2 && computer == 1) {
            System.out.println("컴퓨터가 선택한 숫자는 " + computer + "입니다.");
            System.out.println("당신이 이겼습니다.");
        }
    }

}
