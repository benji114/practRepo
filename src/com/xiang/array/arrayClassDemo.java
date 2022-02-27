package com.xiang.array;

import java.util.Arrays;

public class arrayClassDemo {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,45645,545,343,8768};

        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
