package ex03;

import java.util.Scanner;

/**
 * 구구단 만들기
 * 2. 스캐너를 이용하여 입력받은 단만 출력하시오.
 */
public class GugudanEx02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("출력을 원하는 구구단의 숫자를 입력하세요. ex) 2단: 2 입력");
        int dan = sc.nextInt();
//        System.out.println(dan);

        System.out.println(dan + "단");
        for (int i = 1; i < 10; i++) {
            System.out.println(dan + " * " + i + " = " + (dan * i));
        }
//        // 2단 만들기
//        for (int i = 2; i < 10; i++) {
//            System.out.println(i + "단");
//            for (int j = 1; j < 10; j++) {
//                System.out.println(i + " * " + j + " = " + (i * j));
//            }
//            System.out.println();
//        }
    }
}
