import javax.swing.*;
import java.awt.event.*;

public class RadioExample implements ActionListener {

JFrame f;
JRadioButton r1,r2;
JButton b;

RadioExample(){

f=new JFrame();

r1=new JRadioButton("A) Male");
r2=new JRadioButton("B) Female");
r1.setBounds(75,50,100,30);
r2.setBounds(75,100,100,30);
ButtonGroup bg=new ButtonGroup();
bg.add(r1);bg.add(r2);
b = new JButton("Click Here");
b.setBounds(75,150,120,30);
b.addActionListener(this);

f.add(r1);f.add(r2); f.add(b);



f.setSize(300,300);

f.setLayout(null);

f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
public void actionPerformed(ActionEvent e){
    if(r1.isSelected()){
        JOptionPane.showMessageDialog(f,"You are Male");
    }
    else if(r2.isSelected()){
        JOptionPane.showMessageDialog(f,"You are Female");
    }
}
public static void main(String[] args) {

new RadioExample();
}}