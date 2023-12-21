package ex05;

public class MyMath {
    public static int abs(int x) {
        return x > 0 ? x : -x;
    }

    public static int power(int base, int exponent) { // exponent = 지수
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base; // *= -> 곱하기 할당 연산자, 오른쪽 피연산자의 값을 변수에 곱한 결과를 다시 변수에 할당
        }
        return result;

    }
}
