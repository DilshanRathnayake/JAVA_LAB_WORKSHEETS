package LW_10.Q1;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {


    private String[][] row = {
            {"Amal","CS/2022/020","85"},
            {"Nimali","ET/2022/014","77"},
            {"Kamal","CT/2022/011","92"}
    };

    private String[] column = {"Name","ID","Marks"};

    MyFrame() {
        setTitle("MyFrame");
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());


        JTable jTable = new JTable(row, column);
        JScrollPane scrollPane = new JScrollPane(jTable);
        scrollPane.setBounds(50, 50, 400, 100);
        add(scrollPane);



    }


}
