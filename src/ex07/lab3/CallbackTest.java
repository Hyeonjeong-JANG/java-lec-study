package ex07.lab3;

import java.util.Timer;
import java.util.TimerTask;

class MyClass extends TimerTask {

    @Override
    public void run() {
        System.out.println("beep");
    }
}

public class CallbackTest {
    public static void main(String[] args) {
        TimerTask task = new MyClass();
        Timer timer = new Timer();
        timer.schedule(task, 0, 1000);

        try {
            Thread.sleep(10000); // 10초 동안 실행 대기
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        timer.cancel(); // 타이머 중지
    }
}