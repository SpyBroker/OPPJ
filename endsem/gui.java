import javax.swing.*;
import java.awt.event.*;

public class gui{
    public static void main(String[] args){
        JFrame f=new JFrame("GUI Example");

        JTextField tf1 = new JTextField();
        tf1.setBounds(20, 20, 100, 20);
        JTextField tf2 = new JTextField();
        tf2.setBounds(120, 20, 100, 20);

        JLabel lb = new JLabel();
        lb.setToolTipText("This is a Lable");
        lb.setBounds(50,50,150,20);
        

        JButton b = new JButton("Sum");
        b.setBounds(50,100,95,30);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int a=Integer.parseInt(tf1.getText());
                int b=Integer.parseInt(tf2.getText());
                lb.setText("Sum: " + (a+b));
            }
        });

        JPasswordField pf1 = new JPasswordField();
        pf1.setBounds(20, 150, 100, 20);
        JPasswordField pf2 = new JPasswordField();
        pf2.setEchoChar('$');
        pf2.setBounds(120, 150, 100, 20);

        JTextArea ta = new JTextArea();
        ta.setBounds(20, 200, 200, 100);
        JLabel lb2 = new JLabel();
        lb2.setBounds(20, 310, 200, 20);
        JButton b2 = new JButton("Show Text");
        b2.setBounds(250, 200, 100, 30);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                lb2.setText("Text: " + ta.getText());
            }
        });

        JCheckBox cb1 = new JCheckBox("Option 1");
        cb1.setBounds(250, 20, 100, 20);
        JCheckBox cb2 = new JCheckBox("Option 2");
        cb2.setBounds(250, 50, 100, 20);

        JRadioButton rb1 = new JRadioButton("Male");
        rb1.setBounds(250, 80, 100, 20);
        JRadioButton rb2 = new JRadioButton("Female");
        rb2.setBounds(250, 110, 100, 20);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        String[] colours={"Red", "Green", "Blue","Orange","Yellow"};
        JList list = new JList<>(colours);
        JScrollPane sp = new JScrollPane(list);
        sp.setBounds(250, 250, 100, 80);  // increase height for better scrolling

        JComboBox<String> comboBox = new JComboBox<>(colours);
        comboBox.setBounds(250, 350, 100, 20);


        f.add(tf1);
        f.add(tf2);
        f.add(b);
        f.add(lb);
        f.add(pf1);
        f.add(pf2);
        f.add(ta);
        f.add(b2);
        f.add(lb2);
        f.add(cb1);
        f.add(cb2);
        f.add(rb2);
        f.add(rb1);
        f.add(sp);
        f.add(comboBox);

        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}