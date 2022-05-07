package Basics;

import javax.swing.*;

public class DialogDemo {
    JDialog dialog;

    public DialogDemo(){
        dialog = new JDialog();
        dialog.setTitle("Dialog window");
        dialog.setVisible(true);
        dialog.setSize(300,150);
        dialog.setLocationRelativeTo(null);

        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.setResizable(false);
    }

    public static void main(String[] args) {
        DialogDemo run = new DialogDemo();
    }
}
