package ex10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventTest1 extends JFrame {
    private JButton button;
    private JLabel label;
    int counter = 0;

    class MyListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            counter++;
            label.setText("현재의 카운터 값: " + counter);
        }
    }

    public EventTest1() {
        setSize(400, 150);
        setTitle("Event Example");
        setLayout(new FlowLayout());
        button = new JButton("increase");
        label = new JLabel("The counter value of current" + counter);
        button.addActionListener(new MyListener());
        add(label, "Center");
        add(button, "East");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventTest1 t = new EventTest1();
    }
}
