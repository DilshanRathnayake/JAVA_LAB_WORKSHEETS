package LW_10.Q3;

import javax.swing.*;
import java.awt.*;

public class Jpanel extends JFrame {


    public Jpanel() {

        setTitle("JPanel");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(5, 5));


        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.LIGHT_GRAY);

        JButton save = new JButton("Save");
        JButton update = new JButton("Update");
        JButton delete = new JButton("Delete");

        panel.add(save);
        panel.add(update);
        panel.add(delete);

        add(panel, BorderLayout.CENTER);



    }
}
