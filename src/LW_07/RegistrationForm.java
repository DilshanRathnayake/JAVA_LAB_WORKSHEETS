package LW_07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm extends JFrame {



    public RegistrationForm() {

        setSize(900, 600);
        setTitle("Registration Form");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Added for proper application exit

        JPanel jPanel = new JPanel();
        jPanel.setLayout(null); // Using null layout for absolute positioning

        JLabel title = new JLabel("Registration Form");
        title.setFont(new Font("Arial", Font.BOLD, 28));
        title.setBounds(300, 10, 200, 30);
        jPanel.add(title);

        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(50, 60, 100, 25);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 20));
        jPanel.add(nameLabel);


        JTextField nameFeild = new JTextField();
        nameFeild.setBounds(150, 60, 200, 25);
        jPanel.add(nameFeild);


        JLabel mobileLabel = new JLabel("Mobile");
        mobileLabel.setBounds(50, 95, 100, 25);
        mobileLabel.setFont(new Font("Arial", Font.BOLD, 20));
        jPanel.add(mobileLabel);

        JTextField mobileFeild = new JTextField();
        mobileFeild.setBounds(150, 95, 200, 25);
        jPanel.add(mobileFeild);

        JLabel genderLabel = new JLabel("Gender");
        genderLabel.setBounds(50, 130, 100, 25);
        genderLabel.setFont(new Font("Arial",Font.BOLD, 20));
        jPanel.add(genderLabel);

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(150,130,70,25);
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(230, 130,80,25);

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        jPanel.add(male);
        jPanel.add(female);


        JLabel dobLabel = new JLabel("DOB");
        dobLabel.setBounds(50, 165, 100, 25);
        dobLabel.setFont(new Font("Arial", Font.BOLD, 20));
        jPanel.add(dobLabel);

        JComboBox<String> day = new JComboBox<>();
        for (int  i = 1; i <= 31; i++){
            day.addItem(String.valueOf(i));
        }
        day.setBounds(150, 165, 50, 25);

        JComboBox<String> month = new JComboBox<>(
            new String[]{"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"});
        month.setBounds(210, 165, 70, 25);


        JComboBox<String> year = new JComboBox<>();
        for (int i = 1990; i <= 2025; i++){
            year.addItem(String.valueOf(i));
        }
        year.setBounds(300, 165, 70, 25);

        jPanel.add(day);
        jPanel.add(month);
        jPanel.add(year);


        JLabel addressLabel = new JLabel("Address");
        addressLabel.setBounds(50, 200, 100, 25);
        addressLabel.setFont(new Font("Arial", Font.BOLD, 20));
        jPanel.add(addressLabel);

        JTextArea addressArea = new JTextArea();
        addressArea.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        addressArea.setBounds(150, 200, 300, 100);
        jPanel.add(addressArea);

        JCheckBox terms = new JCheckBox("Accept Terms and Conditions.");
        terms.setBounds(150, 320, 250, 25);
        jPanel.add(terms);

        JButton submit = new JButton("Submit");
        submit.setBounds(150, 360, 80, 25);
        jPanel.add(submit);


        JLabel messageLabel = new JLabel("");
        messageLabel.setBounds(150,400,300,25);
        messageLabel.setForeground(Color.BLACK);
        messageLabel.setFont(new Font("Arial",Font.CENTER_BASELINE , 18));
        jPanel.add(messageLabel);

        JTextArea messageArea = new JTextArea();
        messageArea.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        messageArea.setBounds(520, 60, 300, 400);
        jPanel.add(messageArea);


        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Successfully Submitted..");


                String name = nameFeild.getText();
                String mobile = mobileFeild.getText();
                String gender = "";
                if (male.isSelected()){
                    gender = "Male";
                }else if (female.isSelected()){
                    gender = "Female";
                }

                String dob = day.getSelectedItem() + " " + month.getSelectedItem() + " " + year.getSelectedItem();
                String address = addressArea.getText();

                String data = "Name : " + name + "\n" + "Mobile : " + mobile + "\n" + "Gender : " + gender + "\n" + "DOB : " + dob + "\n" + "Address : " + address;
                messageArea.setText(data);

            }
        });


        JButton reset = new JButton("Reset");
        reset.setBounds(270, 360, 80, 25);
        jPanel.add(reset);

        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Clear text fields
                nameFeild.setText("");
                mobileFeild.setText("");
                addressArea.setText("");

                // Clear radio buttons
                bg.clearSelection();

                // Reset combo boxes
                day.setSelectedIndex(0);
                month.setSelectedIndex(0);
                year.setSelectedIndex(0);

                // Uncheck checkbox
                terms.setSelected(false);

                // Clear the success message
                messageLabel.setText("");
                messageArea.setText("");
            }
        });











        this.add(jPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new RegistrationForm().setVisible(true);
        });
    }
}