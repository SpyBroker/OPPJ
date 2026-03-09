package p11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StringGUI extends JFrame implements ActionListener
{
    JLabel l1,l2;
    JTextField t1,t2;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;

    StringGUI()
    {
        setTitle("String Operations");
        setSize(700,400);
        setLayout(new FlowLayout());

        l1 = new JLabel("Enter the string:");
        l2 = new JLabel("Result:");

        t1 = new JTextField(30);
        t2 = new JTextField(30);

        b1 = new JButton("IN CAPS");
        b2 = new JButton("IN SMALL");
        b3 = new JButton("CONVERT CASE");
        b4 = new JButton("REVERSE");
        b5 = new JButton("VOWELS");
        b6 = new JButton("FREQUENCY");
        b7 = new JButton("WORDS");
        b8 = new JButton("LETTERS");
        b9 = new JButton("BEGIN CAPS");
        b10 = new JButton("RESET");

        add(l1); add(t1);
        add(l2); add(t2);

        add(b1); add(b2); add(b3); add(b4); add(b5);
        add(b6); add(b7); add(b8); add(b9);
        add(b10);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        String str = t1.getText();
        String result="";

        if(e.getSource()==b1)
            result = str.toUpperCase();

        if(e.getSource()==b2)
            result = str.toLowerCase();

        if(e.getSource()==b3)
        {
            char ch[] = str.toCharArray();
            for(int i=0;i<ch.length;i++)
            {
                if(Character.isUpperCase(ch[i]))
                    ch[i]=Character.toLowerCase(ch[i]);
                else
                    ch[i]=Character.toUpperCase(ch[i]);
            }
            result = new String(ch);
        }

        if(e.getSource()==b4)
            result = new StringBuilder(str).reverse().toString();

        if(e.getSource()==b5)
        {
            int count=0;
            for(char c: str.toLowerCase().toCharArray())
                if("aeiou".indexOf(c)>=0)
                    count++;
            result="Vowels: "+count;
        }

        if(e.getSource()==b6)
        {
            int freq[]=new int[256];
            for(char c:str.toCharArray())
                freq[c]++;

            for(int i=0;i<256;i++)
                if(freq[i]>0)
                    result += (char)i+"="+freq[i]+" ";
        }

        if(e.getSource()==b7)
        {
            String words[]=str.trim().split("\\s+");
            result="Words: "+words.length;
        }

        if(e.getSource()==b8)
        {
            int count=0;
            for(char c:str.toCharArray())
                if(Character.isLetter(c))
                    count++;
            result="Letters: "+count;
        }

        if(e.getSource()==b9)
        {
            String words[]=str.split(" ");
            StringBuilder sb=new StringBuilder();
            for(String w:words)
                sb.append(Character.toUpperCase(w.charAt(0)))
                  .append(w.substring(1).toLowerCase())
                  .append(" ");
            result=sb.toString();
        }

        if(e.getSource()==b10)
        {
            t1.setText("");
            t2.setText("");
            return;
        }

        t2.setText(result);
    }

    public static void main(String args[])
    {
        new StringGUI();
    }
}