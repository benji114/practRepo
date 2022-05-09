package com.xiang.puzzle;

public class Puzzle {
    public static void main(String[] args) {
        String words = "Words backwards three";
//        String[] reverseWords = words.split(" ");
//
//        System.out.print("Reverse order is : ");
//        for (int i = reverseWords.length-1; i >=0 ; --i) {
//            System.out.print(reverseWords[i]+" ");
//        }
//        System.out.println();
//        int i =0;
//        i++;
//        System.out.println(i);

        String newReverseWords = "";
        String temp = "";
        for (int j = words.length()-1; j >= 0 ; j--) {
            if(words.charAt(j)!= ' '){
                temp = words.charAt(j) + temp;
            }else {
                newReverseWords += temp +" ";
                temp="";
            }
        }

        if(temp.length()!=0){
            newReverseWords+=temp;
        }

        System.out.println(newReverseWords);
    }

}
