package Basics;

import javax.swing.*;

public class PanelDemo extends JFrame {
    JPanel panel;

    public PanelDemo(){
        panel = new JPanel();
        setSize(300,300);
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("The frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel);

    }

    public static void main(String[] args) {
        PanelDemo run = new PanelDemo();
    }

}
