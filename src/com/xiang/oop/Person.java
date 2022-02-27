package com.xiang.oop;

public class Person {
    String name;
    int age;

    public Person(String name){
        this.name = name;
    }
    //encapsulation including setter and getter
    public String getName() {
        return name;
    }

    public Person() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
