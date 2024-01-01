package ex09.ex09.programming;

import javax.swing.*;
import java.awt.*;

public class Ex07 extends JFrame {
    
    Ex07() {
        setSize(500, 200);
        setTitle("My Frame");
        setLayout(new GridLayout(4, 5));


        int R = (int) (Math.random() * 256);
        int G = (int) (Math.random() * 256);
        int B = (int) (Math.random() * 256);
        Color color = new Color(R, G, B);
        JPanel mainPanel = new JPanel();
        add(mainPanel);
        int[] labels = new int[20];
        int index = 0;

        setVisible(true);
    }

    public static void main(String[] args) {
        Ex07 ex = new Ex07();
    }
}
