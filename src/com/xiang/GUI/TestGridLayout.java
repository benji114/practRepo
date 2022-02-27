package com.xiang.GUI;

import java.awt.*;

public class TestGridLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Panel panel = new Panel();
        Panel panel1 = new Panel();

        Button button = new Button("East");
        Button button1 = new Button("West");
        Button button2 = new Button("South");
        Button button3 = new Button("North");
        Button button4 = new Button("Center");
//
//        frame.setLayout(new GridLayout(3,2));
//        frame.add(button);
//        frame.add(button1);
//        frame.add(button2);
//        frame.add(button3);
//        frame.add(button4);
        frame.add(panel);
        //frame.add(panel1);
        panel.add(button,BorderLayout.WEST);
        panel.add(button1,BorderLayout.EAST);
        panel.add(button2,BorderLayout.SOUTH);
        panel.add(button3,BorderLayout.NORTH);
        //panel1.add(button1);
        frame.setSize(400,400);
        //frame.pack();//自动选择最优布局
        frame.setVisible(true);
    }
}
