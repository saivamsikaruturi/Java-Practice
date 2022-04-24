package com.vamsi.javaPractice;

import java.util.Arrays;

public class ZerosToEnd {
    public static void main(String[] args) {
        int array[]={1,2,5,0,8,2,0,11,77,0,2,0};
        int k=0;
        for(int i=0;i<array.length-1;i++){
            if(array[i]!=0)
                array[k++]=array[i];

        }
        for (int i = k; i < array.length; i++) {
           array[i] = 0;
            System.out.println (i);
        }
    System.out.println (Arrays.toString (array));
    }
}
