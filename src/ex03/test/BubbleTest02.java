package ex03.test;

public class BubbleTest02 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3}; // 안의 구조는 변해야 하니까 final이 아니야

        final int N = arr.length; // 상수의 이름은 대문자로 정의한다.

//        // 두 번째 도전: 4바퀴 도는데, 1회전 때 4바퀴 도는 내부 for문 만들기
//        for (int i = 0; i < N - 1; i++) {
//            for (int j = 0; j < N - 1; j++) {
//                System.out.println("몇 번 돌지?");
//            }
//            System.out.println();
//        }

        // 세 번째 도전: 4바퀴 도는데, 내부는 4, 3, 2, 1로 돌기
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                System.out.println("몇 번 돌지?");
            }
            System.out.println();
        }
    }
}
