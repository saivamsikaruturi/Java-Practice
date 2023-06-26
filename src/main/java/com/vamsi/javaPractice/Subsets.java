package com.vamsi.javaPractice;

public class Subsets {
    public static void main(String[] args) {
        String s1="Vamsi";
        int length=s1.length ();
        int temp=0;
        String arr[]=new String[length*(length+1)/2];
        for(int i=0;i<length;i++){
            for(int j=i;j<length;j++){
                arr[temp]=s1.substring (i,j+1);
                temp++;
            }
        }
        System.out.println ("All");
        for(int i=0;i< arr.length;i++){
            System.out.println (arr[i]);
        }
    }
}
