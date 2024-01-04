package ex16;

/**
 * synchronized 키워드를 사용하여 특정 객체를 동기화 객체로 설정하면,
 * 해당 객체를 점유하고 있는 스레드는 다른 스레드가 동시에 접근할 수 없도록 제한한다.
 * 이를 통해 synchronized 블록 내부의 코드를 안전하게 실행할 수 있다.
 */
public class DeadLockTest {
    public static void main(String[] args) {
        final String res1 = "Gold";
        final String res2 = "Silver";

        Thread t1 = new Thread(() -> {
            synchronized (res1) {
                System.out.println("Thread 1: 자원 1 획득");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    synchronized (res2) {
                        System.out.println("Thread 1: 자원 2 획득");
                    }
                }
            }
        });

        // 교착상태인 코드이다. 교착상태를 해결하려면
        Thread t2 = new Thread(() -> {
            synchronized (res1) {
                System.out.println("Thread 2: 자원 1 획득");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    synchronized (res2) {
                        System.out.println("Thread 2: 자원 2 획득");
                    }
                }
            }
        });
        t1.start();
        t2.start();
    }
}