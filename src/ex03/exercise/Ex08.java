package ex03.exercise;

// 시그마 계산하기
public class Ex08 {
    public static void main(String[] args) {
        int num = 4;
        int sigma = 0;
        for (int i = 1; i <= num; i++) {
            sigma = sigma + (i * i + 1);
        }
        System.out.println(sigma);
//        int numPlus = (1 * 1 + 1) + (2 * 2 + 1) + (3 * 3 + 1) + (4 * 4 + 1);
//        System.out.println(numPlus);
    }
}
