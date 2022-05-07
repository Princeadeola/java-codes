package Basics;

import javax.swing.*;

public class TabbedPaneDemo extends JFrame {

    JTabbedPane tabbedPane;

    public TabbedPaneDemo(){
        tabbedPane = new JTabbedPane(JTabbedPane.BOTTOM);
        tabbedPane.addTab("Tab1", null);
        tabbedPane.addTab("Tab2", null);
        tabbedPane.setSize(150,150);

        setTitle("TabbedPane Demo");
        setSize(300,300);
        setVisible(true);
        add(tabbedPane);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        TabbedPaneDemo run = new TabbedPaneDemo();
    }
}
