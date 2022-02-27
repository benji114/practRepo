package com.xiang.GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalc extends Frame {

    TextField textField1,textField2,textField3;
    Button button;
    Label label;

    public void load(){
        textField1 = new TextField(10);
        textField2 = new TextField(10);
        textField3 = new TextField(20);

        label = new Label("+");

        button = new Button("=");

        setLayout(new FlowLayout());
        add(textField1);
        add(label);
        add(textField2);
        add(button);
        add(textField3);
        setVisible(true);
        pack();


        button.addActionListener(new MyCalcListener());
    }
    //内部类，最大的好处就是畅通无阻的访问外部类的属性与方法
   private class MyCalcListener implements ActionListener{
        //method 1
        //private TextField num1,num2,num3;
        //组合  eg) class A{ private B b;}
        //SimpleCalc simpleCalc = null;

        //method 2
        //改造为面向对象
//        public MyCalcListener(SimpleCalc simpleCalc) {
//            this.simpleCalc = simpleCalc;
////        this.num1=num1;
////        this.num2=num2;
////        this.num3=num3;
//        }

        @Override
        public void actionPerformed(ActionEvent e) {
            //method 1
//        int n1 = Integer.parseInt(num1.getText());
//        int n2= Integer.parseInt(num2.getText());
            //改造为面向对象 method 2
//            int n1 = Integer.parseInt(simpleCalc.textField1.getText());
//            int n2 = Integer.parseInt(simpleCalc.textField2.getText());
//            simpleCalc.textField3.setText(""+(n1+n2));
//            simpleCalc.textField1.setText("");
//            simpleCalc.textField2.setText("");
            //使用内部类后可直接访问外部类的属性 method 3
            int n1 = Integer.parseInt(textField1.getText());
            int n2 = Integer.parseInt(textField2.getText());
            textField3.setText(""+(n1+n2));
            textField1.setText("");
            textField2.setText("");
        }
}




}
