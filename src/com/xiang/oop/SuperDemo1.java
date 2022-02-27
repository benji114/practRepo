package com.xiang.oop;

public class SuperDemo1 extends SuperDemo{
    String name = "kuangshen";

    public SuperDemo1() {
        super();//execute the constructor from parent class,must be in the first line of the code within the son's method
        //this(); either using one of child's method or parent method at the same time,never both
        //when parent has no default constructor,child also cannot has default constructor
        System.out.println("this is son");
    }

    public void test(){
//        System.out.println(name);
//        System.out.println(this.name);
//        System.out.println(super.name);
        print(); //current class method
        this.print(); //current class method
        super.print();
    }

    public void print(){
        System.out.println("qinjiang");
    }
}
