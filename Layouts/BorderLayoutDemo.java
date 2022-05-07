package Layouts;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo extends JFrame {

    // Declare our components
    JButton reset, add, update, delete;

    public BorderLayoutDemo(){
        // created object of each button component
        reset = new JButton("Reset");
        add = new JButton("Add");
        update = new JButton("Update");
        delete = new JButton("Delete");

        // calling the JFrame properties
        setVisible(true); // set visibility
        setSize(300,300); // set height
        setLocationRelativeTo(null); // set the location to center
        setTitle("BorderLayout"); // set the title of the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close the JFrame X button is clicked


        // set Layout
        BorderLayout layout = new BorderLayout();
        setLayout(layout);

        // add each component to the frame
        add(add, BorderLayout.NORTH);
        add(reset, BorderLayout.EAST);
        add(update, BorderLayout.WEST);
        add(delete, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        BorderLayoutDemo run = new BorderLayoutDemo();
    }
}
