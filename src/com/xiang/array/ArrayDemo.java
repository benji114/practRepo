package com.xiang.array;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("=====================");
        int sum =0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        System.out.println("total = "+sum);
        System.out.println("=====================");

        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println(max);
        System.out.println("=====================");

        printArray(a);
        System.out.println("=====================");
        int[] reverse = reverse(a);
        printArray(reverse);
    }

    public static void printArray(int[] array){
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static int[] reverse(int[] array){
        int[] result = new int[array.length];
        for (int i = 0,j=result.length-1; i < array.length; i++,j--) {
            result[j]=array[i];
        }


        return result;
    }
}
