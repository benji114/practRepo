package com.xiang.GUI;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PanelDemo {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Panel panel = new Panel();
        frame.setLayout(new FlowLayout());

        frame.setBounds(300,300,500,500);
        frame.setBackground(new Color(201, 31, 31));

        panel.setBounds(50,50,400,400);
        panel.setBackground(new Color(162, 129, 129, 255));
        frame.add(panel);

        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
