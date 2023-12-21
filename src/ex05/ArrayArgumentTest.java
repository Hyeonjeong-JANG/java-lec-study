package ex05;

/**
 * 배열을 받아서 최솟값을 계산하여 반환하는 메소드 minArray(double[] list)를 작성하고 테스트해보자.
 * 첫 번째 배열의 최솟값 = 0.1
 * 두 번째 배열의 최솟값 = -9.0
 */

public class ArrayArgumentTest {

    public static double minArray(double[] list) {
        double min = list[0];

        for (int i = 1; i < list.length; i++) {
            if (list[i] < min) { // list의 배열의 모든 값을 list[0]보다 작은지 체크
                min = list[i]; // 작으면 min은 list[i]로 대체됨.
            }
        }
        return (min); // 배열에서 가장 작은 값이 return됨
    }

    public static void main(String[] args) {
        double[] a = {1.1, 2.2, 3.3, 4.4, 0.1, 0.2};
        double[] b = {-2.0, 3.0, -9.0, 2.9, 1.5};

        double min;

        min = minArray(a);
        System.out.println("첫 번째 배열의 최솟값: " + min);
        min = minArray(b);
        System.out.println("두 번째 배열의 최솟값: " + min);
    }
}
