package com.xiang.GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestFieldDemo extends Frame {
    public TestFieldDemo(){
        TextField textField = new TextField();
        add(textField);

        MyActionListener myActionListener = new MyActionListener();
        textField.addActionListener(myActionListener);

        textField.setEchoChar('*');
        setVisible(true);
        pack();
    }
}

class MyActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        TextField textField1 = (TextField) e.getSource();
        //textField1.getText();
        System.out.println(textField1.getText());
    }
}
