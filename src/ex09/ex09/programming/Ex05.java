package ex09.ex09.programming;

import javax.swing.*;
import java.awt.*;

public class Ex05 extends JFrame {
    Ex05() {
        setSize(500, 300);
        setTitle("BMI 계산기");

        setLayout(new FlowLayout());
        JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel panel4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        panel1.setPreferredSize(new Dimension(500, 30));
        panel2.setPreferredSize(new Dimension(500, 30));
        panel3.setPreferredSize(new Dimension(500, 30));
        panel4.setPreferredSize(new Dimension(500, 30));

        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);

        JLabel label1 = new JLabel("나의 BMI 지수는 얼마나 될까?");
        JLabel label2 = new JLabel("나의 체중(kg):  ");
        JTextField textField1 = new JTextField("         ");
        JLabel label3 = new JLabel("나의 키(m):     ");
        JTextField textField2 = new JTextField("         ");
        JButton button = new JButton("BMI 확인하기");

        panel1.add(label1);
        panel2.add(label2);
        panel2.add(textField1);
        panel3.add(label3);
        panel3.add(textField2);
        panel4.add(button);

        //setAlignmentX(Component.LEFT_ALIGNMENT);

        setVisible(true);

    }

    public static void main(String[] args) {
        Ex05 ex = new Ex05();
    }
}
