package ex10;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventTest4 extends JFrame {
    private JButton button;
    private JLabel label;
    int counter = 0;

    public EventTest4() {
        this.setSize(400, 150);
        this.setTitle("example");

        JPanel panel = new JPanel();
        button = new JButton("increase");

        label = new JLabel("current value " + counter);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter++;
                label.setText("current value" + counter);
            }
        });

        panel.add(label);
        panel.add(button);
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventTest4 f = new EventTest4();
    }
}
