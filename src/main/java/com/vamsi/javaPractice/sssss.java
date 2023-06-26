package com.vamsi.javaPractice;

import java.util.Arrays;

public class sssss {
    public static void main(String[] args) {
      //  System.out.println (extracted (new int[]{1, 2, 0, 7, 8, 0, 3, 0}));
    }

    public static String extracted(int[] array) {
        int j=0;
        int[]k=new int[array.length];
        for(int i=0;i<array.length;i++){
            if(array[i]>0){
                k[j++]=array[i];
            }
        }
        return Arrays.toString (k);
    }
}
