package LW_08;


import javax.swing.*;
import java.awt.*;

public class RegistrationFroms extends JFrame {

    public RegistrationFroms() {

        setSize(400, 550);
        setTitle("Registration form");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);


        JLabel title = new JLabel("Sign Up");
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setBounds(150, 10, 200, 30);
        title.setForeground(Color.BLUE);
        panel.add(title);

        JLabel name = new JLabel("Name ");
        name.setBounds(20, 60, 200, 20);
        name.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(name);

        JTextField nameFeild = new JTextField();
        nameFeild.setBounds(120, 60, 200, 25);
        panel.add(nameFeild);

        JLabel email = new JLabel("Email ");
        email.setBounds(20, 100, 200, 20);
        email.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(email);

        JTextField emailFeild = new JTextField();
        emailFeild.setBounds(120,100,200, 25);
        panel.add(emailFeild);

        JLabel gender = new JLabel("Gender ");
        gender.setBounds(20,140,200, 20);
        gender.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(gender);

        JRadioButton male = new JRadioButton("Male ");
        male.setBounds(120, 140, 70, 25);
        JRadioButton female = new JRadioButton("Femail ");
        female.setBounds(240, 140, 70, 20);
        panel.add(male);
        panel.add(female);

        JLabel age = new JLabel("BirthDay ");
        age.setBounds(20, 180, 200, 20);
        age.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(age);

        JComboBox<String> day = new JComboBox<>();
        for (int i = 1; i <= 31; i++){
            day.addItem(String.valueOf(i));
        }
        day.setBounds(120, 180, 60,25);
        panel.add(day);

        JComboBox<String> month = new JComboBox<>(
                new String[] {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"}
        );
        month.setBounds(180, 180, 80, 25);
        panel.add(month);

        JComboBox<String> year = new JComboBox<>();
        for (int i = 1990; i <= 2025; i++){
            year.addItem(String.valueOf(i));
        }
        year.setBounds(240, 180, 100, 25);
        panel.add(year);

        JLabel password = new JLabel("Password ");
        password.setBounds(20, 220, 200,25);
        password.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(password);

        JTextField passwordFeild = new JTextField();
        passwordFeild.setBounds(120, 220, 200, 25);
        panel.add(passwordFeild);

        JCheckBox terms = new JCheckBox("I am not a robot");
        terms.setBounds(18, 260, 250, 25);
        panel.add(terms);

        JButton signup = new JButton("Sign Up");
        signup.setBounds(20, 300, 340, 25);
        signup.setForeground(Color.WHITE);
        signup.setBackground(Color.BLUE);
        panel.add(signup);

        JLabel secondTitle = new JLabel("Sign Up");
        secondTitle.setFont(new Font("Arial", Font.BOLD, 24));
        secondTitle.setBounds(150, 340, 200, 30);
        secondTitle.setForeground(Color.BLUE);
        panel.add(secondTitle);


        JLabel secondEmail = new JLabel("Email ");
        secondEmail.setBounds(20, 380, 200, 25);
        secondEmail.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(secondEmail);

        JTextField secondEmailFeild = new JTextField();
        secondEmailFeild.setBounds(120, 380, 200, 25);
        panel.add(secondEmailFeild);

        JLabel secondPassword = new JLabel("Password ");
        secondPassword.setBounds(20, 420, 200, 25);
        secondPassword.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(secondPassword);

        JTextField secondPasswordFeild = new JTextField();
        secondPasswordFeild.setBounds(120, 420, 200,25);
        panel.add(secondPasswordFeild);

        JButton signin = new JButton("Sign Up");
        signin.setBounds(20, 460, 340, 25);
        signin.setForeground(Color.WHITE);
        signin.setBackground(Color.BLUE);
        panel.add(signin);


        this.add(panel);

    }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new RegistrationFroms().setVisible(true);
        });
    }



}
