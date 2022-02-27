package com.xiang.override;

//overload: mutiple method in same class that has same name but different parameter
//override: there always inheritance relationship,
// child has same method name as parent with same/different method body

public class Application {
    //static method 方法的调用只和左边的，定义的数据类型有关
    // non static method can be override

    public static void main(String[] args) {


        A a = new A();
        a.test();//A
        //父类的引用指向子类
        B b = new A(); //子类重写了父类的方法
        b.test();//B
    }
}
