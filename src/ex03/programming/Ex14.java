package ex03.programming;

/**
 * 다음과 같은 2차원 배열을 순회하면서 전체 요소 값을 화면에 출력하는 프로그램을 작성하라.
 * 출력 예시
 * int[][] a={{1,2,3},{1,2},{1},{1,2,3}};
 * 1 2 3
 * 1 2
 * 1
 * 1 2 3
 */
public class Ex14 {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {1, 2}, {1}, {1, 2, 3}};
//        System.out.println(a.length);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
