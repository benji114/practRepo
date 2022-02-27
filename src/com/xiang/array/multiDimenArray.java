package com.xiang.array;

public class multiDimenArray {
    /*
    store stucture: 4行2列
    1,2     a[0]
    2,3     a[1]
    3,4     a[2]
    4,5     a[3]
     */
    public static void main(String[] args) {
        int[][] a = {{1,2},{2,3},{3,4},{4,5}};
        printArray(a[0]);
        System.out.println(a[0][0]);
        System.out.println(a[0][1]);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j]);
            }
        }
    }


    public static void printArray(int[] array){
        for (int i : array) {
            System.out.println(i);
        }
    }

}
