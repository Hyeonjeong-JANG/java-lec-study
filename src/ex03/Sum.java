package ex03;

// 1에서 10까지 정수의 합을 구하자.
public class Sum {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum = sum + (i + 1);
        }
        System.out.println("1에서 10까지 정수의 합은 " + sum + "이다.");
    }
}
