package p12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StopWatch extends JFrame implements ActionListener, Runnable {

    JLabel timeLabel;
    JButton startBtn, resetBtn;

    int ms = 0, sec = 0, min = 0, hr = 0;
    boolean running = false;

    Thread t;

    StopWatch() {
        setTitle("Stop Watch");

        timeLabel = new JLabel("00 : 00 : 00 : 00");
        timeLabel.setFont(new Font("Arial", Font.BOLD, 30));
        timeLabel.setHorizontalAlignment(JLabel.CENTER);

        startBtn = new JButton("Start");
        resetBtn = new JButton("Reset");

        startBtn.addActionListener(this);
        resetBtn.addActionListener(this);

        setLayout(new BorderLayout());

        JPanel p = new JPanel();
        p.add(startBtn);
        p.add(resetBtn);

        add(timeLabel, BorderLayout.CENTER);
        add(p, BorderLayout.SOUTH);

        setSize(400,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void run() {
        try {
            while (running) {
                Thread.sleep(10);
                ms++;

                if (ms == 100) {
                    ms = 0;
                    sec++;
                }

                if (sec == 60) {
                    sec = 0;
                    min++;
                }

                if (min == 60) {
                    min = 0;
                    hr++;
                }

                timeLabel.setText(
                        String.format("%02d : %02d : %02d : %02d", hr, min, sec, ms));
            }
        } catch (Exception e) {}
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == startBtn) {
            running = true;
            t = new Thread(this);
            t.start();
        }

        if (e.getSource() == resetBtn) {
            running = false;
            hr = min = sec = ms = 0;
            timeLabel.setText("00 : 00 : 00 : 00");
        }
    }

    public static void main(String args[]) {
        new StopWatch();
    }
}