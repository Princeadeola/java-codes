package Listeners;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerExample extends JFrame implements MouseListener {
    JLabel label;

    public MouseListenerExample(){
        setTitle("Mouse Listener");
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        label = new JLabel("Initial Text!");
        add(label);
        addMouseListener(this);
    }

    public static void main(String[] args) {
        MouseListenerExample run = new MouseListenerExample();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Clicked");
        label.setText("Mouse Clicked!");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Pressed");
        label.setText("Mouse Pressed!");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Released");
        label.setText("Mouse Released!");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered");
        label.setText("Mouse Entered!");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited");
        label.setText("Mouse Exited!");
    }
}
