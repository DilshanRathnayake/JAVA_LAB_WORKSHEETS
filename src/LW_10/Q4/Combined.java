package LW_10.Q4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Combined extends JFrame {

    private String[][] row = {
            {"Amal","CS/2022/020","85"},
            {"Nimali","CS/2022/014","77"},
            {"Kamali","CS2022/011","92"}
    };

    private String[] column = {"Name", "ID","Marks"};

     public Combined(){

         setTitle("Combined Task");
         setSize(400, 400);
         setDefaultCloseOperation(EXIT_ON_CLOSE);

         JMenuBar menuBar = new JMenuBar();

         JMenu fileMEnu = new JMenu("File");

         JMenuItem openItem = new JMenuItem("Open");
         JMenuItem exitItem = new JMenuItem("Exit");

         openItem.setEnabled(false);

         exitItem.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 System.exit(0);
             }
         });



         fileMEnu.add(openItem);
         fileMEnu.add(exitItem);

         menuBar.add(fileMEnu);

         setJMenuBar(menuBar);



         JTable table = new JTable(row, column);
         JScrollPane scrollPane = new JScrollPane(table);
         scrollPane.setBorder(BorderFactory.createEmptyBorder(60,15,10,15));
         scrollPane.setBounds(50, 100, 400, 100);
         add(scrollPane);

         JPanel panel = new JPanel();
         panel.setBackground(Color.LIGHT_GRAY);


         JButton save = new JButton("Save");
         JButton update = new JButton("Update");
         JButton delete = new JButton("Delete");

         panel.add(save);
         panel.add(update);
         panel.add(delete);

         panel.setBorder(BorderFactory.createEmptyBorder(0,0,20,0));

         add(panel, BorderLayout.SOUTH);







     }



}
