package ex09.ex09.programming;

import javax.swing.*;
import java.awt.*;

public class Ex04 extends JFrame {
    Ex04() {
        setSize(500, 300);
        setTitle("JLabel Test");

        setLayout(new GridLayout(0, 5));
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
//        JPanel panel5 = new JPanel();
        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);
//        add(panel5);

        JLabel label1 = new JLabel("Red");
        JLabel label2 = new JLabel("Yellow");
        JLabel label3 = new JLabel("Green");
        JLabel label4 = new JLabel("Blue");
        panel1.add(label1);
        panel2.add(label2);
        panel3.add(label3);
        panel4.add(label4);

        JButton b1 = new JButton();
        JButton b2 = new JButton();
        JButton b3 = new JButton();
        JButton b4 = new JButton();

        b1.setBackground(Color.red);
        b1.setSize(50, 50);
        b2.setBackground(Color.yellow);
        b2.setSize(50, 50);
        b3.setBackground(Color.green);
        b3.setSize(50, 50);
        b4.setBackground(Color.blue);
        b4.setSize(50, 50);


        panel1.add(b1);
        panel2.add(b2);
        panel3.add(b3);
        panel4.add(b4);
        setVisible(true);
    }

    public static void main(String[] args) {
        Ex04 ex = new Ex04();
    }
}
