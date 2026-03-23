import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

public class GUIDemo extends JFrame implements ActionListener, ItemListener, MouseListener {

    // Components
    JLabel label;
    JTextField textField;
    JPasswordField passwordField;
    JTextArea textArea;
    JButton button;
    JCheckBox checkBox;
    JRadioButton r1, r2;
    ButtonGroup group;
    JList<String> list;
    JComboBox<String> comboBox;

    public GUIDemo() {

        // JFrame settings
        setTitle("Complete GUI Demo");
        setSize(600, 600);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JLabel
        label = new JLabel("Enter Name:");
        label.setToolTipText("This is a label");
        add(label);

        // JTextField
        textField = new JTextField("Default Text", 15);
        textField.setColumns(20);
        add(textField);

        // JPasswordField
        passwordField = new JPasswordField(15);
        passwordField.setEchoChar('*');
        add(passwordField);

        // JTextArea
        textArea = new JTextArea(5, 20);
        textArea.append("Write something...\n");
        add(textArea);

        // JButton
        button = new JButton("Submit");
        button.addActionListener(this);
        add(button);

        // JCheckBox
        checkBox = new JCheckBox("Accept Terms", true);
        checkBox.addItemListener(this);
        add(checkBox);

        // JRadioButton
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");

        group = new ButtonGroup();
        group.add(r1);
        group.add(r2);

        add(r1);
        add(r2);

        // JList
        String[] items = {"Java", "Python", "C++"};
        list = new JList<>(items);
        add(list);

        // JComboBox
        String[] countries = {"India", "USA", "UK"};
        comboBox = new JComboBox<>(countries);
        comboBox.addItem("Canada"); // method
        add(comboBox);

        // Mouse Listener
        addMouseListener(this);

        setVisible(true);
    }

    // ActionListener (Button click)
    public void actionPerformed(ActionEvent e) {
        String name = textField.getText();
        String pass = new String(passwordField.getPassword());
        String selectedItem = list.getSelectedValue();
        String country = (String) comboBox.getSelectedItem();

        textArea.append("Name: " + name + "\n");
        textArea.append("Password: " + pass + "\n");
        textArea.append("List: " + selectedItem + "\n");
        textArea.append("Country: " + country + "\n");
    }

    // ItemListener (Checkbox)
    public void itemStateChanged(ItemEvent e) {
        if (checkBox.isSelected()) {
            textArea.append("Checkbox Selected\n");
        } else {
            textArea.append("Checkbox Unselected\n");
        }
    }

    // MouseListener methods
    public void mouseClicked(MouseEvent e) {
        textArea.append("Mouse Clicked\n");
    }

    public void mouseEntered(MouseEvent e) {
        textArea.append("Mouse Entered\n");
    }

    public void mouseExited(MouseEvent e) {
        textArea.append("Mouse Exited\n");
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}

    public static void main(String[] args) {
        new GUIDemo();
    }
}