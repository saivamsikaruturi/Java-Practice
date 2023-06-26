package com.vamsi.javaPractice;

public class rtyu {
    public static void main(String[] args) {
        int[] array={1,2,3,2,4,2,0};
        int j=array.length-1;
        for(int i=0;i<array.length;i++){
            if(i<j && array[j]==2)
                j--;
            if(array[i]==2)
                swap(array,i,j);

        }
        for(int k=0;k<array.length;k++){
            System.out.println (array[k]);
        }
    }

    private static int[] swap(int[] array, int i, int j) {
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
        return array;
    }
}
