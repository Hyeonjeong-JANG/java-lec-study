package ex09.ex09.programming;

import javax.swing.*;
import java.awt.*;

// 사이즈의 절대값을 어떻게 하는지 좀 더 공부하자.
// 패딩이나 마진 주는 방법도
public class Ex04 extends JFrame {
    Ex04() {
        setSize(500, 200);
        setTitle("JLabel Test");

        JPanel panel1 = new JPanel();
        add(panel1);
        panel1.setSize(500, 50);
        panel1.setLayout(new GridLayout(0, 5));
        JLabel label1 = new JLabel("Red");
        JLabel label2 = new JLabel("Yellow");
        JLabel label3 = new JLabel("Green");
        JLabel label4 = new JLabel("Blue");
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        label3.setHorizontalAlignment(SwingConstants.CENTER);
        label4.setHorizontalAlignment(SwingConstants.CENTER);

        panel1.add(label1);
        panel1.add(label2);
        panel1.add(label3);
        panel1.add(label4);

        JPanel panel2 = new JPanel();
        add(panel2);
        panel2.setSize(500, 100);
        panel2.setLayout(new GridLayout(0, 5, 20, 20));

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();

//        p1.setPreferredSize(new Dimension(80, 80));
//        p2.setPreferredSize(new Dimension(80, 80));
//        p3.setPreferredSize(new Dimension(80, 80));
//        p4.setPreferredSize(new Dimension(80, 80));

        p1.setBackground(Color.red);
        p2.setBackground(Color.yellow);
        p3.setBackground(Color.green);
        p4.setBackground(Color.blue);

//        p1.setSize(80, 80);
//        p2.setSize(80, 80);
//        p3.setSize(80, 80);
//        p4.setSize(80, 80);

        panel2.add(p1);
        panel2.add(p2);
        panel2.add(p3);
        panel2.add(p4);

        setVisible(true);
    }

    public static void main(String[] args) {
        Ex04 ex = new Ex04();
    }
}
