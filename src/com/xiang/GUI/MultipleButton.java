package com.xiang.GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultipleButton {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Button button1 = new Button("start");
        Button button2 = new Button("stop");

        frame.add(button1,BorderLayout.NORTH);
        frame.add(button2,BorderLayout.SOUTH);

        MyActionlistener myActionlistener = new MyActionlistener();
        button1.addActionListener(myActionlistener);
        button2.addActionListener(myActionlistener);


        frame.setVisible(true);
        frame.pack();


    }
}


class MyActionlistener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("start")){
            System.out.println("start being press");
        }else{
            System.exit(0);
        }
    }
}