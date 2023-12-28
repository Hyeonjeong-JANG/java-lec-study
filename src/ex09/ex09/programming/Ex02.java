package ex09.ex09.programming;

import javax.swing.*;
import java.awt.*;

public class Ex02 extends JFrame {

    Ex02() {
        setSize(500, 300);
        JPanel panel = new JPanel();
        add(panel);
        setTitle("My Frame");

        setLayout(new FlowLayout());
        JLabel label = new JLabel("카운터 값   ");
        panel.add(label);

        JTextField textField = new JTextField("0                         ");
        panel.add(textField);

        JButton button = new JButton("증가");
        panel.add(button);

        setVisible(true);
    }

    public static void main(String[] args) {
        Ex02 ex = new Ex02();
    }
}
