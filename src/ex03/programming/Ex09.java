package ex03.programming;

/**
 * 반복문을 이용하여 피보나치 수열을 구하는 프로그램을 작성하여 보자.
 */
public class Ex09 {
    public static void main(String[] args) {

        int[] fibo = new int[10];
        fibo[0] = 0;
        fibo[1] = 1;
        int num = 0;
        for (int i = 0; i < 10 - 2; i++) {
            fibo[i + 2] = fibo[i] + fibo[i + 1];
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(fibo[i] + " ");
        }
    }
}
