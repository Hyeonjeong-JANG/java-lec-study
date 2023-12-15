package ex03.programming;

/**
 * 3*5 크기의 2차원 배열을 생성하고 0으로 초기화한다.
 * 여기에 5개의 정수 1을 랜덤하게 배열에 배치해보자(난수를 인덱스를 사용한다).
 * 최종 배열을 화면에 출력한다.
 * <p>
 * 출력 예시
 * 0 1 0 0 0
 * 0 1 1 0 0
 * 1 0 0 1 0
 */
public class Ex15 {
    public static void main(String[] args) {
        int[][] random = new int[3][5];
//        int random1 = (int) (Math.random() * 3);
//        int random2 = (int) (Math.random() * 5);
        int randomNum = 0;
        for (int i = 0; i < random.length; i++) {
            for (int j = 0; j < random[i].length; j++) {
                randomNum = (int) (Math.random() * 2);
//                random[i][j] = random[random1][random2];
//                random[random1][random2] = randomNum;
                random[i][j] = randomNum;

                System.out.print(random[i][j] + " ");
            }
            System.out.println();
        }

    }
}
