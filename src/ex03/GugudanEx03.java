package ex03;

/**
 * 구구단 만들기
 * 3. 구구단 옆으로 출력하기
 */
public class GugudanEx03 {
    public static void main(String[] args) {
        System.out.println("2단\t\t\t3단\t\t\t4단\t\t\t5단\t\t\t6단\t\t\t7단\t\t\t8단\t\t\t9단");
        for (int j = 1; j < 10; j++) {
            for (int i = 2; i < 10; i++) {
                System.out.print(i + " * " + j + " = " + (i * j) + "\t");
            }
            System.out.println();

        }
    }
}
