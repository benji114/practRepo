package com.xiang.polymoph;


//polymoph majorly use on method
//inheritance must exist
// X instanceof Y
//只能由父类（左边）指向子类（右边）的对象

public class Application {
    public static void main(String[] args) {

        //父类的引用指向子类
        //子类能调用的方法包括自己的以及父类的
        //父类只能调用自己的方法，不能调用子类的方法
//        Student s1 = new Student();
//        Person s2 = new Student();
//        Object s3 = new Student();
//
//        s2.run(); //once the method being override, son's method will always be executed
//        s1.run();

        //instance keyword 用于判断类型是否相似
        //Object > Person > Student
        //Object > Person > InstanceOfDemo
        //Object > String
        Object s4 = new Student();
//        System.out.println(s4 instanceof Student);//true
//        System.out.println(s4 instanceof Person);//true
//        System.out.println(s4 instanceof Object);//true
//        System.out.println(s4 instanceof InstanceOfDemo);//false
//        System.out.println(s4 instanceof String);//false

        Person s5 = new Student();
//        System.out.println(s5 instanceof Student);//true
//        System.out.println(s5 instanceof Person);//true
//        System.out.println(s5 instanceof Object);//true
//        System.out.println(s5 instanceof InstanceOfDemo);//false
        //System.out.println(s5 instanceof String); Person 与String 同级，编译报错

        Student s6 = new Student();
//        System.out.println(s6 instanceof Student);//true
//        System.out.println(s6 instanceof Person);//true
//        System.out.println(s6 instanceof Object);//true
        //System.out.println(s6 instanceof InstanceOfDemo);//编译报错
        //System.out.println(s6 instanceof String);//编译报错

        //类型转化 父  子
        //高 > 低 （强制转换） force casting （有风险）
        Person student = new Student();
        //将student对象转换为Student类型才可以使用Student class的方法
        //student.go();
        Student s7 = (Student) student;
        s7.go();
        //or in other format
        ((Student) student).go();
        //低转高 自动转换
        Student s8 = new Student();
        Person person = s8;
        //person.go(); 子类转换成父类可能会丢失自己本来的一些方法

    }
}
