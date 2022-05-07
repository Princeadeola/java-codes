package Basics;

import javax.swing.*;
import java.awt.*;

public class MenuBarDemo extends JFrame {
    JMenuBar menuBar;

    public MenuBarDemo(){
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        setSize(300,300);
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("JMenuBar Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        MenuBarDemo run = new MenuBarDemo();
    }
}
