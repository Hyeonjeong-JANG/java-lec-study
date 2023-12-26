package ex07.example;

import javax.swing.*;

//class BasicFrame extends JFrame {
//    public BasicFrame() {
//
//    }
//};

public class MyFrameEx01 {
    static int num = 1;

    public static void main(String[] args) {
        JFrame jf = new JFrame();
//        jf.setLayout(new BorderLayout());
        jf.setSize(300, 500);

        JButton btn1 = new JButton("더하기");
        JButton btn2 = new JButton("빼기");
        JLabel la1 = new JLabel(num + ""); // 인트를 스트링에 넣고 싶으면 num+"" 여기다 넣으면 형변환이 됨.

        jf.add("North", btn1);
        jf.add("South", btn2);
        jf.add("Center", la1);

        btn1.addActionListener(e -> {
            num++;
            la1.setText(num + "");
        });
        btn2.addActionListener(e -> {
            num--;
            if (num < 0) {
                num = 0;
            }
            la1.setText(num + "");
        });

        jf.setVisible(true);
    }
};
