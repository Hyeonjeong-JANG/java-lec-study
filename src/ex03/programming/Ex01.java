package ex03.programming;

import java.util.Scanner;

/**
 * 사용자가 입력한 값이 1, 2,..., 9이면 "ONE", "TWO",...,"NINE"과 같이 출력하는 프로그램을 작성하라. 1부터 9사이가 아니면 "OTHER"을 출력한다.
 */
public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int userNum = sc.nextInt();

        if (userNum == 1) {
            System.out.println("ONE");
        } else if (userNum == 2) {
            System.out.println("TWO");
        } else if (userNum == 3) {
            System.out.println("FOUR");
        } else if (userNum == 4) {
            System.out.println("FIVE");
        } else if (userNum == 5) {
            System.out.println("SIX");
        } else if (userNum == 6) {
            System.out.println("SEVEN");
        } else if (userNum == 7) {
            System.out.println("EIGHT");
        } else if (userNum == 8) {
            System.out.println("NINE");
        } else if (userNum == 9) {
            System.out.println("TEN");
        } else {
            System.out.println("OTHER");
        }
    }
}
