import java.awt.event.*;

import javax.swing.*;

class LabelExample
{
    public static void main(String [] args)
    {
        JFrame f = new JFrame("Label Example");

        JLabel l1,l2;
        JButton b;
        b = new JButton("Click Here");
        b.setBounds(50,20,100,30);

        l1 = new JLabel();
        l1.setBounds(50,50,100,30);

        l2 = new JLabel("Second Label");
        l2.setBounds(50,100,100,30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                l1.setText("First label");
            }
        });

        f.add(l1);
        f.add(l2);
        f.add(b);

        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}