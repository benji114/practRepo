package com.xiang.classwithinclass;

public class Outer {
    private int ID =10;
    public void out(){
        System.out.println("outer class method");
    }

    public static class inner{
        public void in(){
            System.out.println("inner class method");
        }
        //获得外部class的私有属性
        public void getID(){
            System.out.println(new Outer().ID);
        }

        public static class Inner{

        }
    }

    public void method(){
        class Inner{

        }
    }
}
//一个java类中可以有多个class,但是只能有一个public class
class A{

}
