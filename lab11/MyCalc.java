package p11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyCalc extends JFrame implements ActionListener {

    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1, b2, b3, b4;

    MyCalc() {

        setTitle("My Calc");
        setSize(450,250);
        setLayout(new GridLayout(4,3,10,10));

        l1 = new JLabel("Enter the First Number:");
        l2 = new JLabel("Enter the Second Number:");
        l3 = new JLabel("Result:");

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t3.setEditable(false);

        b1 = new JButton("Add");
        b2 = new JButton("Subtract");
        b3 = new JButton("Multiply");
        b4 = new JButton("Reset");

        add(l1);
        add(t1);
        add(b1);

        add(l2);
        add(t2);
        add(b2);

        add(l3);
        add(t3);
        add(b3);

        add(new JLabel(""));
        add(b4);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        try {

            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            int result = 0;

            if(e.getSource() == b1)
                result = num1 + num2;

            if(e.getSource() == b2)
                result = num1 - num2;

            if(e.getSource() == b3)
                result = num1 * num2;

            if(e.getSource() == b4){
                t1.setText("");
                t2.setText("");
                t3.setText("");
                return;
            }

            t3.setText(String.valueOf(result));

        } catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Enter valid numbers");
        }
    }

    public static void main(String[] args) {
        new MyCalc();
    }
}