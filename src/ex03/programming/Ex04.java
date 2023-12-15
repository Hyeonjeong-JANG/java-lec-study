package ex03.programming;

/**
 * 1부터 100 사이의 정수 중에서 3 또는 4의 배수의 합을 계산하는 프로그램을 작성하라.
 */
public class Ex04 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
