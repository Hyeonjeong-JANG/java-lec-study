package ex02.programming;

import java.util.Scanner;

/**
 * 상점에 가면 우리는 상품에 대한 돈을 내고 영수증을 받는다. 영수증에는 10% 부가세와 잔돈 등이 인쇄되어 있다. 구입한 상품의 가격과 손님한테 받은 금액을 입력하면 부가세와 잔돈을 출력하는 프로그램을 작성하여 보자.
 * 출력 형태
 * 받은 돈: 10000
 * 상품 가격: 7500
 * 부가세: 750
 * 잔돈: 2500
 */
public class Ex07 {
    public static void main(String[] args) {
        //받은 돈과 상품 가격 입력 받기
        Scanner sc = new Scanner(System.in);
        System.out.print("받은 돈: ");
        int received = sc.nextInt();
        System.out.print("상품 가격: ");
        int price = sc.nextInt();
        int tax = price / 10;
        int change = received - price;
        System.out.println();
        System.out.println("영수증");
        System.out.println("받은 돈: " + received);
        System.out.println("상품 가격: " + price);
        System.out.println("부가세: " + tax);
        System.out.println("잔돈: " + change);
    }
}
