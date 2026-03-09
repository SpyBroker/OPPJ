package p11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RGBColorDemo extends JFrame implements ActionListener
{
    JLabel l1,l2,l3;
    JComboBox<Integer> c1,c2,c3;
    JButton b;
    JPanel p;

    RGBColorDemo()
    {
        setTitle("My Frame");
        setSize(400,300);
        setLayout(new FlowLayout());

        p = new JPanel();
        p.setPreferredSize(new Dimension(350,200));

        l1 = new JLabel("Red");
        l2 = new JLabel("Green");
        l3 = new JLabel("Blue");

        Integer values[] = new Integer[256];
        for(int i=0;i<=255;i++)
        {
            values[i]=i;
        }

        c1 = new JComboBox<>(values);
        c2 = new JComboBox<>(values);
        c3 = new JComboBox<>(values);

        b = new JButton("Show Output");
        b.addActionListener(this);

        add(l1); add(c1);
        add(l2); add(c2);
        add(l3); add(c3);
        add(b);
        add(p);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        int r = (Integer)c1.getSelectedItem();
        int g = (Integer)c2.getSelectedItem();
        int b = (Integer)c3.getSelectedItem();

        Color color = new Color(r,g,b);
        p.setBackground(color);
    }

    public static void main(String args[])
    {
        new RGBColorDemo();
    }
}