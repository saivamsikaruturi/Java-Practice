package com.vamsi.javaPractice.Arrays;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array=new int[]{1,77777, 8,34,99};
        bubbleSort (array);
        System.out.println (Arrays.toString (array));
    }
    public static void bubbleSort(int a[]) {
        if(a.length <= 1) {
            return;
        }

        for(int i = 0; i < a.length ; i++) {
            for(int j = i+1; j < a.length ; j++) {
                if(a[i] > a[j ]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
    }
}
