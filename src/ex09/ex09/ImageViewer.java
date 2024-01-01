package ex09.ex09;

import javax.swing.*;
import java.awt.*;

// 개 사진을 보여줘라.
public class ImageViewer extends JFrame {
    ImageViewer() {
        setSize(500, 420);
        setLayout(new BorderLayout());
        JPanel imgPanel = new JPanel();
        add(imgPanel, "North");
        imgPanel.setBackground(Color.pink);
        imgPanel.setPreferredSize(new Dimension(300, 320));
        JLabel descLabel = new JLabel();
        imgPanel.add(descLabel);

        ImageIcon dogImg = new ImageIcon("d://dog.jpg");
        descLabel.setIcon(dogImg);
        imgPanel.add(descLabel);
        JPanel buttonPanel = new JPanel();
        add(buttonPanel, "South");
        buttonPanel.setBackground(Color.blue);
        buttonPanel.setPreferredSize(new Dimension(300, 100));
        JButton b1 = new JButton("<<");
        JButton b2 = new JButton("<");
        JButton b3 = new JButton(">");
        JButton b4 = new JButton(">>");
        buttonPanel.add(b1);
        buttonPanel.add(b2);
        buttonPanel.add(b3);
        buttonPanel.add(b4);

        setVisible(true);

    }


    public static void main(String[] args) {
        ImageViewer imageViewer = new ImageViewer();
    }
}
