package com.vamsi.javaPractice;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int inputSize=sc.nextInt ();
        int[]array=new int[inputSize];
        if(inputSize<4){
            System.out.println ("Invalid Input");
        }
        else{
            for(int i=0;i<inputSize;i++){
                array[i]=sc.nextInt ();
            }
            int sum=0;
            for(int i=0;i<inputSize-1;i++){
                for(int j=i+1;j<inputSize-1;j++){
                    int n=0;
                    n=array[i]+array[j]+array[j+1] ;
                if(n>sum){
                    sum=n;
                }
                }
            }
            System.out.println (sum);
        }
    }
}
