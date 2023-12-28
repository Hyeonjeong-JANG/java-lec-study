package ex09.ex09.programming;

import javax.swing.*;
import java.awt.*;

public class Ex03 extends JFrame {
    Ex03() {
        setSize(500, 300);
        setTitle("My Frame");
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        add(panel1);
        add(panel2);

        JLabel label = new JLabel("자바 호텔에 오신 것을 환영합니다. 숙박일수를 입력하세요.");
        panel1.add(label);
        setLayout(new FlowLayout());
        JButton b1 = new JButton("1일");
        JButton b2 = new JButton("2일");
        JButton b3 = new JButton("3일");
        JButton b4 = new JButton("4일");
        JButton b5 = new JButton("5일");
        panel2.add(b1);
        panel2.add(b2);
        panel2.add(b3);
        panel2.add(b4);
        panel2.add(b5);

        setVisible(true);
    }

    public static void main(String[] args) {
        Ex03 ex = new Ex03();
    }
}
