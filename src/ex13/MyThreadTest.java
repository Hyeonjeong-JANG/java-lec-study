package ex13;

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }
}

public class MyThreadTest {
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
    }
}