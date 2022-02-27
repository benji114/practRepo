package com.xiang.GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ListenerDemo {
    public static void main(String[] args) {
        Frame frame = new Frame();

        Button button = new Button();

        frame.add(button);
        frame.pack();
        frame.setVisible(true);

        windowClose(frame);


        button.addActionListener(new MyøActionlisener());
    }


    private static void windowClose(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

class MyøActionlisener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("aaa");
    }
}
