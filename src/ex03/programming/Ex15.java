package ex03.programming;

/**
 * 3*5 크기의 2차원 배열을 생성하고 0으로 초기화한다.
 * 여기에 5개의 정수 1을 랜덤하게 배열에 배치해보자(난수를 인덱스로 사용한다).
 * 최종 배열을 화면에 출력한다.
 * <p>
 * 출력 예시
 * 0 1 0 0 0
 * 0 1 1 0 0
 * 1 0 0 1 0
 */

public class Ex15 {
    public static void main(String[] args) {
        int[][] randomArr = new int[3][5];
        int count = 0;
        int randomNum = 0;
        int random1 = (int) (Math.random() * 3);
        int random2 = (int) (Math.random() * 5);
        while (true) {
            randomNum = (int) (Math.random() * 2);
            random1 = (int) (Math.random() * 3);
            random2 = (int) (Math.random() * 5);
            randomArr[random1][random2] = randomNum;
            count++;
            if (count == 5) {
                break;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(randomArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
