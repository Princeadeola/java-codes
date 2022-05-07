package Listeners;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerExample extends JFrame implements ActionListener {

    Button btn;
    TextField text;
    int count = 0;

    public ActionListenerExample(){
        this.setTitle("Action Listener");
        setSize(300,300);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        setLayout(new FlowLayout());
        btn =  new Button("Click");
        text = new TextField(30);

        btn.addActionListener(this);

        add(btn);
        add(text);

    }

    public static void main(String[] args) {
        ActionListenerExample run = new ActionListenerExample();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        text.setText("clicked for the " + count + " times");
        count++;
    }
}

