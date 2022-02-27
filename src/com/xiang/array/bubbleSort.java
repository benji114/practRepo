package com.xiang.array;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] a = {6,4,56,2,87,12,5,6,88};

//        int[] sort = sort(a);
//        System.out.println(Arrays.toString(sort));
        newSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static int[] sort(int[] arrays){
        int temp =0;
        for (int i = 0; i < arrays.length-1; i++) {
            for (int j = 0; j < arrays.length-1-i; j++) {
                if(arrays[j+1]<arrays[j]){
                    temp = arrays[j];
                    arrays[j]=arrays[j+1];
                    arrays[j+1] = temp;
                }
            }
        }
        return arrays;
    }

    public static void newSort(int[] arrays){
        int temp =0;
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 1; j < arrays.length-i; j++) {
                if(arrays[j]<arrays[j-1]){
                    temp = arrays[j-1];
                    arrays[j-1] = arrays[j];
                    arrays[j] = temp;
                }
            }
        }
    }
}
