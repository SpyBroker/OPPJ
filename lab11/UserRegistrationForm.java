package p11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UserRegistrationForm extends JFrame implements ActionListener
{
    JLabel nameLabel, passLabel, genderLabel, hobbyLabel, countryLabel, addressLabel;
    JTextField nameField;
    JPasswordField passField;
    JRadioButton male, female;
    ButtonGroup genderGroup;
    JCheckBox reading, sports, music;
    JComboBox<String> countryBox;
    JTextArea addressArea;
    JButton submitBtn, resetBtn;

    UserRegistrationForm()
    {
        setTitle("User Registration Form");
        setSize(400,500);
        setLayout(new FlowLayout());

        nameLabel = new JLabel("Name:");
        nameField = new JTextField(20);

        passLabel = new JLabel("Password:");
        passField = new JPasswordField(20);

        genderLabel = new JLabel("Gender:");
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        hobbyLabel = new JLabel("Hobbies:");
        reading = new JCheckBox("Reading");
        sports = new JCheckBox("Sports");
        music = new JCheckBox("Music");

        countryLabel = new JLabel("Country:");
        String countries[] = {"India","USA","UK","Canada"};
        countryBox = new JComboBox<>(countries);

        addressLabel = new JLabel("Address:");
        addressArea = new JTextArea(4,20);

        submitBtn = new JButton("Submit");
        resetBtn = new JButton("Reset");

        submitBtn.addActionListener(this);
        resetBtn.addActionListener(this);

        add(nameLabel); add(nameField);
        add(passLabel); add(passField);
        add(genderLabel); add(male); add(female);
        add(hobbyLabel); add(reading); add(sports); add(music);
        add(countryLabel); add(countryBox);
        add(addressLabel); add(addressArea);
        add(submitBtn); add(resetBtn);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==submitBtn)
        {
            String name = nameField.getText();
            JOptionPane.showMessageDialog(this,"Registration Successful\nWelcome "+name);
        }

        if(e.getSource()==resetBtn)
        {
            nameField.setText("");
            passField.setText("");
            genderGroup.clearSelection();
            reading.setSelected(false);
            sports.setSelected(false);
            music.setSelected(false);
            addressArea.setText("");
        }
    }

    public static void main(String args[])
    {
        new UserRegistrationForm();
    }
}