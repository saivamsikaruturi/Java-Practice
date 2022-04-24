package com.vamsi.javaPractice.Arrays;

import java.util.Arrays;

public class InsertAnElement {

    public static void main(String[] args) {
        int array[]=new int[]{1,2,3,4};
       insertAnElement (array,5);
       insertAnElement (array,66);
           System.out.print (Arrays.toString (array));


    }
    public static void insertAnElement(int[] array,int value){
        for(int i=array.length-1;i>0;i--){
            array[i]=array[i-1];
        }
        array[0]=value;

    }

}
