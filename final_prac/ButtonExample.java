// import javax.swing.*;
// public class swing
// {
//     public static void main(String [] args)
//     {
//         JFrame f = new JFrame(" Swing practice");

//         JButton b = new JButton("Click me");
//         b.setBounds(130,100,100,40);

//         f.add(b);

//         f.setSize(400,500);
//         f.setLayout(null);
//         f.setVisible(true);
//         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }
// }


// // public class swing extends JFrame
// // {
// //     JFrame f;
// //     swing()
// //     {
// //         JButton b = new JButton("Click me");
// //         b.setBounds(130,100,100,40);

// //         add(b);

// //         setSize(400,500);
// //         setLayout(null);
// //         setVisible(true);
// //         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// //     }

// //     public static void main(String [] args)
// //     {
// //         new swing();
// //     }
// // }

// import java.awt.event.*;

// import javax.swing.*;

// public class ButtonExample {

// JFrame f;

// JTextField tf;

// JButton b;

// ButtonExample() {

// f = new JFrame("Button Example");

// tf = new JTextField();

// tf.setBounds (58, 50, 150, 20);

// b= new JButton("Click Here");

// b.setBounds(50, 100, 95, 30);

// b.addActionListener(new ButtonHandler(tf));

// f.add(b);

// f.add(tf);

// f.setSize(400, 400);

// f.setLayout(null);

// f.setVisible(true);

// f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// }

// public static void main(String[] args) {

// new ButtonExample();
// }
// }

// class ButtonHandler implements ActionListener {

// JTextField tf;

// ButtonHandler(JTextField tf) {


// this.tf=tf;
// }

// public void actionPerformed(ActionEvent e) {

// tf.setText("Welcome to Javatpoint.");
// }
// }

import java.awt.event.*;

import javax.swing.*;

public class ButtonExample implements ActionListener {

JFrame f;
JTextField tf;
JButton b;

public ButtonExample() {

    f = new JFrame("Button Example");
    tf = new JTextField();
    tf.setBounds (58, 50, 150, 20);
    b= new JButton("Click Here");
    b.setBounds(50, 100, 95, 30);
    b.addActionListener(this);

    f.add(b);
    f.add(tf);
    f.setSize(400, 400);
    f.setLayout(null);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
    public void actionPerformed(ActionEvent e) {

    tf.setText("Welcome to Javatpoint.");
    }

    public static void main(String[] args) {

    new ButtonExample();
    }
}
