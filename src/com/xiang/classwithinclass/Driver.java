package com.xiang.classwithinclass;

public class Driver {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.inner inner = new Outer.inner();
        inner.in();
    }
}
