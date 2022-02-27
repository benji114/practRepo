package com.xiang.staticDemo;

public class Person {
    //2
    {
        //匿名代码块
        System.out.println("匿名代码块");
    }
    //1 只执行一次
    static {
        //静态代码块
        System.out.println("静态代码块");
    }
    //3
    public Person() {
        System.out.println("构造方法");
    }
}
