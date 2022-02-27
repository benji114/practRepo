package com.xiang.GUI;

import java.awt.*;

public class TestBorderLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Button button = new Button("East");
        Button button1 = new Button("West");
        Button button2 = new Button("South");
        Button button3 = new Button("North");
        Button button4 = new Button("Center");

        frame.setSize(400,400);

        frame.add(button,BorderLayout.EAST);
        frame.add(button1,BorderLayout.WEST);
        frame.add(button2,BorderLayout.SOUTH);
        frame.add(button3,BorderLayout.NORTH);
        frame.add(button4,BorderLayout.CENTER);

        frame.setVisible(true);



    }
}
