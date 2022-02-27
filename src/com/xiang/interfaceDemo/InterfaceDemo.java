package com.xiang.interfaceDemo;

public interface InterfaceDemo {
    //all class within interface are abstract class
    public void run(); // can also written as void run();

    void add(String name);
    void delete(String name);
    void update(String name);
    void query(String name);
}
