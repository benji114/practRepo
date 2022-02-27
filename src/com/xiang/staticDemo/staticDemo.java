package com.xiang.staticDemo;

//non static method can call static method directly,not viable otherwise
//静态导入包
import static java.lang.Math.random;
public class staticDemo {
    private static int age; //静态变量
    private double score; //非静态变量

    public static void main(String[] args) {
        staticDemo s1 = new staticDemo();
        System.out.println(staticDemo.age);
        System.out.println(s1.score);
        s1.run();
        go();

        Person person = new Person();
        System.out.println("=============================");
        Person person1 = new Person();

        System.out.println(Math.random());
        System.out.println(random());
    }

    public void run(){
        go();
    }

    public static void go(){

    }
}
