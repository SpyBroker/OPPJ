package p12;
import javax.swing.*;
import java.awt.*;

class MoveImage extends JPanel implements Runnable {

    int x = 50, y = 50;
    String msg = "Welcome";

    String messages[] = {"Welcome", "Enjoy", "Thanks", "Visit Again"};
    int index = 0;

    public void run() {
        try {
            while (true) {

                for (x = 50; x <= 250; x++) {
                    repaint();
                    Thread.sleep(10);
                }

                for (y = 50; y <= 250; y++) {
                    repaint();
                    Thread.sleep(10);
                }

                for (x = 250; x >= 50; x--) {
                    repaint();
                    Thread.sleep(10);
                }

                for (y = 250; y >= 50; y--) {
                    repaint();
                    Thread.sleep(10);
                }

                msg = messages[index];
                index = (index + 1) % messages.length;
            }

        } catch (Exception e) {}
    }

    public void paint(Graphics g) {
        super.paint(g);

        g.fillOval(x, y, 50, 50); // moving object
        g.drawString(msg, 150, 30); // message
    }
}

public class ImageSquareMove {

    public static void main(String args[]) {

        JFrame f = new JFrame("Moving Image");

        MoveImage m = new MoveImage();

        f.add(m);

        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Thread t = new Thread(m);
        t.start();
    }
}