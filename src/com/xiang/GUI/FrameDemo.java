package com.xiang.GUI;

import java.awt.*;

public class FrameDemo {
    public static void main(String[] args) {
//        Frame frame = new Frame("my first GUI");
//        frame.setVisible(true);
//        frame.setSize(400,400);
//        frame.setBackground(new Color(210, 18, 18));
//        frame.setLocation(200,200);
//        frame.setResizable(false);
        MyFrame myFrame = new MyFrame(100, 100, 200, 200, Color.blue);
        MyFrame myFrame1 = new MyFrame(300, 100, 200, 200, Color.yellow);
        MyFrame myFrame2 = new MyFrame(100, 300, 200, 200, Color.red);
        MyFrame myFrame3 = new MyFrame(300, 300, 200, 200, Color.pink);

    }
}

class MyFrame extends Frame{
    static int id =0;

    public MyFrame(int x,int y,int w,int h,Color color){
        super("MyFrame"+(++id));
        setBackground(color);
        setBounds(x,y,w,h);
        setVisible(true);
    }



}
