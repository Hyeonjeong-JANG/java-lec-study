package ex16.example3;

import javax.swing.*;

public class ThreadEx03 extends JFrame {
    private boolean state = true; // 스레드를 제어하는 것을 얘로 하자.
    private int count = 0;
    private int count2 = 0;
    private JLabel countLabel;
    private JLabel count2Label;

    public ThreadEx03() {
        setTitle("숫자 카운터 프로그램");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//         레이아웃 매니저 설정
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        // 숫자를 표시할 레이블 생성
        countLabel = new JLabel("숫자1: " + count);
        count2Label = new JLabel("숫자2: " + count2); // unreachable code라 도달할 수 없다. 그래서 스레드를 쓰는 것이다.
        // 메인스레드는 UI 스레드로 쓰는 것이 좋아. 그래서 서브 스레드를 두 개 만들어서 돌리는 것이 좋다.
        countLabel.setAlignmentX(CENTER_ALIGNMENT);
        count2Label.setAlignmentX(CENTER_ALIGNMENT);
        add(countLabel);
        add(count2Label);

        // 증가 버튼 생성
        JButton increaseButton = new JButton("멈춤");
        increaseButton.setAlignmentX(CENTER_ALIGNMENT);
        add(increaseButton);

        // 버튼에 액션 리스너 추가
        increaseButton.addActionListener(e -> {
//            System.out.println("버튼 클릭됨");
            state = false;
        });

        // 러너블은 뉴를 할 수 없기 때문에 의미 없는 클래스를 만들어서 그것에 러너블을 구현시키고 그 의미 없는 클래스는 뉴 한다. -> 코드가 더러워져서 잘 안 씀.
        // 익명클래스로 쓸 수도 있다. -> 구식임.
        // 람다 써라!! 이 람다에서 불러오는 것은 run()메서드.
        new Thread(() -> {// while이 있는 스레드를 죽지 않는 스레드라고 해서 데몬 스레드라고 한다.
//            while (true) { // while문이 끝나지 않기 때문에 deadcode이다.
            while (state) { // true 말고 state를 넣어서 버튼을 누르면 false를 할 수 있게 하자.
                try {
                    Thread.sleep(1000);
                    count++;
                    countLabel.setText("숫자1: " + count);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }).start();
        new Thread(() -> {
            while (state) { // while문이 끝나지 않기 때문에 deadcode이다.
                try {
                    Thread.sleep(1000);
                    count2++;
                    count2Label.setText("숫자1: " + count2);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }).start();
        setVisible(true);
    }

    public static void main(String[] args) {
        new ThreadEx03();
    }
}