package com.xiang.override;

public class A extends B{

    @Override //有功能的注释
    public void test() {
        System.out.println("A=>test()");
    }
}
