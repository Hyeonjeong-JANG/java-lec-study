package ex03;

// while문을 써서 환영합니다를 5번 출력하고 반복이 종료되었습니다. 라고 나오게 만들자.
public class WelcomeLoop {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println("환영합니다.");
            i++;
        }
        System.out.println("반복이 종료되었습니다.");
    }
}
