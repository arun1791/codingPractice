package com.Lambda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("My  window");
        jFrame.setSize(400,400);
        jFrame.setLayout(new FlowLayout());
//        () -> ActionListener
        JButton button=new JButton("Click me !");
        button.addActionListener( e->{
            System.out.println("Button click");
            JOptionPane.showMessageDialog(null,"This i scalled ");
        });

        jFrame.add(button);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
