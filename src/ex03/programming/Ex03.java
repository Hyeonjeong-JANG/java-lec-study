package ex03.programming;

/**
 * 369게임을 만들어 보자.
 * 369게임은 숫자에 3,6,9가 포함되어 있으며 3,6,9의 개수만큼 박수를 치는 게임이다.
 * 1부터 50까지의 정수에 대하여 369게임을 실행한다.
 */
public class Ex03 {
    public static void main(String[] args) {

        for (int i = 1; i < 51; i++) {
            if (i % 3 == 0) {// 잘못만들었음. 다시 하기.
                System.out.print("짝 ");
            } else {
                System.out.print(i + " ");
            }
        }

    }
}
