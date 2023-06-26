package com.vamsi.javaPractice;

public class TypePromotion {

    //in method overloading , when an exact data type is not matched ,it is promoted to an upper type.
    static void sum(int a, float b){
        System.out.println (a+b);
    }
    static void sum(float a ,float b){
        System.out.println (a+b);
    }

    public static void main(String[] args) {
        sum (2,3);
    }
}
