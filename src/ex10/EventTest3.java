package ex10;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventTest3 extends JFrame implements ActionListener {
    private JButton button;
    private JLabel label;
    int counter = 0;

    @Override
    public void actionPerformed(ActionEvent e) {
        counter++;
        label.setText("The counter value of current" + counter);
    }

    public EventTest3() {
        this.setSize(400, 150);
        this.setTitle("Event Example");

        JPanel panel = new JPanel();
        button = new JButton("increase");
        label = new JLabel("the value of current" + counter);
        button.addActionListener(this);
        panel.add(label);
        panel.add(button);
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventTest3 t = new EventTest3();
    }
}
