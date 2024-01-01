package ex09.ex09.programming;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Ex06 extends JFrame {
    Ex06() {
        setSize(500, 300);
        JPanel mainPanel = new JPanel(new GridLayout(6, 1, 10, 10));
        mainPanel.setPreferredSize(new Dimension(400, 200));
        add(mainPanel);
        JPanel panel1 = new JPanel();
        mainPanel.add(panel1);
        JLabel labelTitle = new JLabel("회원 등록하기");
        Font fontTitle = new Font("Notosans", Font.PLAIN, 20);
        labelTitle.setFont(fontTitle);
        panel1.add(labelTitle);


        JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        mainPanel.add(panel2);
        JLabel labelName = new JLabel("이름");
        labelName.setPreferredSize(new Dimension(150, 25));
        panel2.add(labelName);
        JTextField insertName = new JTextField("홍길동");
        insertName.setPreferredSize(new Dimension(150, 25));
        panel2.add(insertName);

        JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        mainPanel.add(panel3);
        JLabel labelPassword = new JLabel("패스워드");
        labelPassword.setPreferredSize(new Dimension(150, 25));
        panel3.add(labelPassword);
        JPasswordField insertPassword = new JPasswordField("ㄴㅇㄹㄴㅇㄹㄴㅇㄹ");
        insertPassword.setPreferredSize(new Dimension(150, 25));
        panel3.add(insertPassword);

        JPanel panel4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        mainPanel.add(panel4);
        JLabel labelEmail = new JLabel("이메일 주소");
        labelEmail.setPreferredSize(new Dimension(150, 25));
        panel4.add(labelEmail);
        JTextField insertEmail = new JTextField("abc@example.com");
        insertEmail.setPreferredSize(new Dimension(150, 25));
        panel4.add(insertEmail);

        JPanel panel5 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        mainPanel.add(panel5);
        JLabel labelTel = new JLabel("전화번호");
        labelTel.setPreferredSize(new Dimension(150, 25));
        panel5.add(labelTel);
        JTextField insertTel = new JTextField("010-1234-5678");
        insertTel.setPreferredSize(new Dimension(150, 25));
        panel5.add(insertTel);

        JPanel panel6 = new JPanel();
        mainPanel.add(panel6);
        JButton regButton = new JButton("등록하기");
        regButton.setPreferredSize(new Dimension(100, 25));
        panel6.add(regButton);
        JButton caneleButton = new JButton("취소");
        caneleButton.setPreferredSize(new Dimension(100, 25));
        panel6.add(caneleButton);
//        Insets margin = new Insets(10, 30, 10, 30);
//        regButton.setMargin(margin);
//        caneleButton.setMargin(margin);


        //int leftPadding = 30;
        mainPanel.setBorder(new EmptyBorder(0, 30, 0, 30));
//        regButton.setBorder(new EmptyBorder(0, 20, 0, 20));
//        caneleButton.setBorder(new EmptyBorder(0, 20, 0, 20));
        setVisible(true);


        // 위, 왼쪽, 아래, 오른쪽 여백 설정

    }

    public static void main(String[] args) {
        Ex06 ex = new Ex06();
    }
}
