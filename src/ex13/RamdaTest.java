package ex13;

public class RamdaTest {
    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 0; i <= 10; i++) {
                System.out.print(i + " ");
            }
        };
        new Thread(task).start();
    }
}
