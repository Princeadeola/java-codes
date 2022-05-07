package Basics;

import javax.swing.*;

public class MenuItemDemo extends JFrame {
    JMenuBar menuBar;
    JMenu filemenu, editmenu, exitmenu;
    JMenuItem openitem, newitem, copyitem, pasteitem,
            closeitem;

    public MenuItemDemo(){
        menuBar = new JMenuBar();

        filemenu = new JMenu("File");
        editmenu = new JMenu("Edit");
        exitmenu = new JMenu("Exit");

        newitem = new JMenuItem("New");
        openitem = new JMenuItem("Open");
        copyitem = new JMenuItem("Copy");
        pasteitem = new JMenuItem("Paste");
        closeitem = new JMenuItem("Close");

        filemenu.add(newitem);
        filemenu.add(openitem);
        editmenu.add(copyitem);
        editmenu.add(pasteitem);
        exitmenu.add(closeitem);

        setJMenuBar(menuBar);

        menuBar.add(filemenu);
        menuBar.add(editmenu);
        menuBar.add(exitmenu);

        setSize(300,300);
        setVisible(true);
        setTitle("MenuItem Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        MenuItemDemo run = new MenuItemDemo();
    }
}
