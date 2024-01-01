package ex09.ex09.programming;

import javax.swing.*;
import java.awt.*;

public class Ex01 extends JFrame {
    public Ex01() {
        JPanel panel = new JPanel();
        add(panel);
        setSize(400, 200);
        setTitle("My Frame");
        setLayout(new FlowLayout());
        JLabel label = new JLabel("자바는 재미있나요?");
        JButton button1 = new JButton("Yes");
        JButton button2 = new JButton("No");
        panel.add(label);
        panel.add(button1);
        panel.add(button2);
        setVisible(true);

    }

    public static void main(String[] args) {
        Ex01 ex = new Ex01();
    }
}
