package ex03;

/**
 * 구구단 만들기
 * 1. 2~9단까지 출력되게 만들기
 */
public class GugudanEx01 {
    

    public static void main(String[] args) {

        // 2단 만들기
        for (int i = 2; i < 10; i++) {
            System.out.println(i + "단");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
