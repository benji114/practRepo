package com.xiang.method;

public class RecurrsionDemo {
    public static void main(String[] args) {
        int number = f(10);
        System.out.println(number);
    }

    public static int f(int n){
        if(n == 1){
            return 1;
        }else{
            return n*f(n-2);
        }
    }
}
