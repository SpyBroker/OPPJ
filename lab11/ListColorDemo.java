package p11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ListColorDemo extends JFrame implements ActionListener
{
    JList<String> list;
    JButton btn;
    JPanel panel;

    ListColorDemo()
    {
        setTitle("Color Selector");
        setSize(400,300);
        setLayout(new FlowLayout());

        String colors[] = {"Red","Green","Blue","Yellow"};

        list = new JList<>(colors);
        list.setVisibleRowCount(4);

        JScrollPane sp = new JScrollPane(list);

        btn = new JButton("Change Color");

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(350,150));

        btn.addActionListener(this);

        add(sp);
        add(btn);
        add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        String color = list.getSelectedValue();

        if(color.equals("Red"))
            panel.setBackground(Color.RED);

        else if(color.equals("Green"))
            panel.setBackground(Color.GREEN);

        else if(color.equals("Blue"))
            panel.setBackground(Color.BLUE);

        else if(color.equals("Yellow"))
            panel.setBackground(Color.YELLOW);
    }

    public static void main(String args[])
    {
        new ListColorDemo();
    }
}