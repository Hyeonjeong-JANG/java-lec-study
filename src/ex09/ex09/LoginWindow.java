package ex09.ex09;

import javax.swing.*;

public class LoginWindow extends JFrame {
    public LoginWindow() {
        setTitle("login window");
        setSize(300, 150);

        JPanel panel = new JPanel();
        add(panel);

        panel.add(new JLabel("id   "));
        panel.add(new JTextField(20));
        panel.add(new JLabel("pass"));
        panel.add(new JPasswordField(20));

        JButton login = new JButton("login");
        panel.add(login);

        JButton cancle = new JButton("cancle");
        panel.add(cancle);

        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginWindow();
    }
}
