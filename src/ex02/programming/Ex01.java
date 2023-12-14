package ex02.programming;

import java.util.Scanner;

public class Ex01 {
    /**
     * 하나의 상자에 오렌지를 10개씩 담을 수 있다고 하자. 오렌지가 127개가 있다면 상자 몇 개가 필요한가? 또 몇 개의 오렌지가 남을까?
     * 출력 형태
     * 오렌지의 개수를 입력하시오: 127
     * 12박스가 필요하고 7개가 남습니다.
     * / 연산자와 % 연산자를 사용한다.
     */
    public static void main(String[] args) {
        // 오렌지의 개수 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.print("오렌지의 개수를 입력하십시오: ");
        int orange = sc.nextInt();
//        System.out.println(orange);

        // 나머지: Remainder, 몫: Quotient
        // 박수의 개수 구하기
        int box = orange / 10;
//        System.out.println(box);
        // 나머지 구하기
        int r = orange % 10;
//        System.out.println(r);
        System.out.println(box + "박스가 필요하고 " + r + "개가 남습니다.");
    }
}
