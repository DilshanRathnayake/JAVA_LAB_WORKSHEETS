package LW_10.Q2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {



    Menu(){
        setTitle("My JMenu");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

         JMenu menu = new JMenu("Menu");

         JMenuBar menuBar = new JMenuBar();
         JMenu fileMenu = new JMenu("File");
         JMenuItem openItem = new JMenuItem("open");
         JMenuItem exitItem = new JMenuItem("exit");

         openItem.setEnabled(false);


         fileMenu.add(openItem);
         fileMenu.add(exitItem);

         menuBar.add(fileMenu);

         setJMenuBar(menuBar);


         exitItem.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 System.exit(0);
             }
         });




    }



}
