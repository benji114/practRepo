package com.xiang.oop;


//private method and variable cannot be inherited
//super: 调用父类的构造方法，
// 必须在构造方法的第一个，
// super 必须只能出现在子类的方法或构造中，super 和 this 不能同时调用构造方法

public class Application{
    public static void main(String[] args) {
        SuperDemo1 obj = new SuperDemo1();
    }
}
