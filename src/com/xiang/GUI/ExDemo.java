package com.xiang.GUI;

import java.awt.*;

public class ExDemo {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setLayout(new GridLayout(2,1));
        Panel panel = new Panel(new BorderLayout());
        Panel panel1 = new Panel(new GridLayout(2,2));
        Panel panel2 = new Panel(new BorderLayout());
        Panel panel3 = new Panel(new GridLayout(2,2));

        Button button1 = new Button("East-1");
        Button button2 = new Button("West-1");
        Button button3 = new Button("p2-btn-1");
        Button button4 = new Button("p2-btn-2");
        Button button5 = new Button("p2-left");
        Button button6 = new Button("p2-right");
        Button button7 = new Button("p3-1");
        Button button8 = new Button("p3-2");
        Button button9 = new Button("p3-3");
        Button button10 = new Button("p3-4");
        Button button11 = new Button("p3-4");
        Button button12 = new Button("p3-4");

        panel.add(button1,BorderLayout.EAST);
        panel.add(button2,BorderLayout.WEST);
        panel.add(panel1,BorderLayout.CENTER);

        panel1.add(button3);
        panel1.add(button4);
        panel1.add(button11);
        panel1.add(button12);

        panel2.add(button5,BorderLayout.EAST);
        panel2.add(button6,BorderLayout.WEST);
        panel2.add(panel3,BorderLayout.CENTER);

        panel3.add(button7);
        panel3.add(button8);
        panel3.add(button9);
        panel3.add(button10);



        frame.setSize(400,400);
        frame.add(panel);
        frame.add(panel2);
        frame.setVisible(true);
    }
}
