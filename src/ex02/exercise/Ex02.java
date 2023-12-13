package ex02.exercise;

import java.util.Scanner;

/**
 * 마일을 킬로미터로 변환하는 프로그램을 작성하라. 1마일은 1609킬로미터와 같다. 사용자로부터 마일의 값을 읽어 들인다.
 * 출력 형태
 * 마일을 입력하시오: 10
 * 10.0마일은 16.09킬로미터입니다.
 */
public class Ex02 {
    public static void main(String[] args) {
        // 마일을 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.print("마일을 입력하시오: ");
        double mile = sc.nextDouble();
//        System.out.println(mile);

        // 킬로미터로 변환하기
        double kiloM = mile / 0.62137;
//        System.out.println(kiloM); // 16.09347087...
        // 소수점 두 자리로 자르기
        double roundKM = Math.round(kiloM * 100) / 100.0;
        // *100은 소수점 둘째짜리리에서 반올림을 해주고 값이 1609.0이 된다. 거기에 100을 곱하면 원하는 값이 나옴.
        System.out.println(mile + "마일은 " + roundKM + "킬로미터입니다.");
    }
}
