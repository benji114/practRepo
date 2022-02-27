package com.xiang.GUI;

import java.awt.*;

public class TestFlowLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();

        Button button = new Button("button1");
        Button button1 = new Button("button1");
        Button button2 = new Button("button1");
        //流氏布局，从左到右
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));


        frame.setSize(200,200);
        frame.add(button);
        frame.add(button1);
        frame.add(button2);

        frame.setVisible(true);
    }
}
