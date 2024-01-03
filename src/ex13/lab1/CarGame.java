package ex13.lab1;

import javax.swing.*;

public class CarGame extends JFrame {
    class MyThread extends Thread {
        private JLabel label;
        private int x, y;

        public MyThread(String fname, int x, int y) {
            this.x = x;
            this.y = y;
            label = new JLabel();
            label.setIcon(new ImageIcon(fname));
            label.setBounds(x, y, 100, 100);
            add(label);
        }

        public void run() {
            for (int i = 0; i < 200; i++) {
                x += 10 * Math.random();
                label.setBounds(x, y, 100, 100);
                repaint();

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public CarGame() {
        setTitle("CarRace");
        setSize(600, 250);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        (new MyThread("C:\\Users\\G\\Documents\\Lightshot\\Car1.png", 100, 0)).start();
        (new MyThread("C:\\Users\\G\\Documents\\Lightshot\\Car2.png", 100, 50)).start();
        (new MyThread("C:\\Users\\G\\Documents\\Lightshot\\Car3.png", 100, 100)).start();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        CarGame t = new CarGame();
    }
}
