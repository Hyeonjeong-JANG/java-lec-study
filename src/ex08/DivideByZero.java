package ex08;

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("입력하세요.");
        int num = sc.nextInt();

        int result = 0;
        try { // 정상인 경우 값이 제대로 나옴
            result = 10 / num;
        } catch (Exception e) {
//            System.out.println("0으로 나누면 안 된다"); // 값이 이상하게 들어오면 캐치문 안의 것이 출력된다.
//            System.out.println("e.getMessage(): " + e.getMessage());
//            System.out.print("e.printStackTrace(): ");
//            e.printStackTrace(); // 정확하게 오류를 알고 싶으면 이것을 하면 된다. 로그에는 이 값을 넣는다.
//            System.out.println("e.getCause(): " + e.getCause());
//            System.out.println("e.getClass(): " + e.getClass());
            throw new RuntimeException("0으로 나눌 수 없어요.");
        }
        System.out.println("연산의 결과: " + result);
    }
}
