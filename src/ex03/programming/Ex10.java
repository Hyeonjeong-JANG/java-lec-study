package ex03.programming;

/**
 * {1.0, 2.0, 3.0, 4.0}과 같은 초기값을 가지는 double형의 배열을 생성한다.
 * 모든 배열 요소를 출력한 후에 모든 요소를 더하여 합을 출력하고 요소 중에서 가장 큰 값을 찾아서 출력하는 프로그램을 작성하라.
 * <p>
 * 출력 예시
 * 1.0 2.0 3.0 4. 0
 * 합은 10.0
 * 최대값은 4.0
 */
public class Ex10 {
    public static void main(String[] args) {
        final double[] D = {1.0, 2.0, 3.0, 4.0};
        double sum = 0;
        double max = 0;
        double temp;
        for (int i = 0; i < D.length; i++) {
            sum = sum + D[i];


            for (int j = 0; j < D.length - 1; j++) {
                if (D[j] > D[j + 1]) {
                    temp = D[j];
                    D[j] = D[j + 1];
                    D[j + 1] = temp;

                }
            }
        }
        for (int i = 0; i < D.length; i++) {
            System.out.print(D[i] + " ");
        }
        System.out.println();
        System.out.println("합은" + sum);
        System.out.println("최댓값은: " + D[D.length - 1]);
    }
}
