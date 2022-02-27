package com.xiang.GUI;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class PaintDemo extends Frame {

    ArrayList point;

    public void load(){

        setBounds(200,200,400,400);
        setVisible(true);

        point = new ArrayList<>();

        this.addMouseListener(new MyMouseListener());
    }
    @Override
    public void paint(Graphics g) {

    }

    private class MyMouseListener extends MouseAdapter{
        @Override
        public void mousePressed(MouseEvent e) {
            PaintDemo paintDemo = (PaintDemo) e.getSource();
            new Point(e.getX(),e.getY());
        }
    }
}

