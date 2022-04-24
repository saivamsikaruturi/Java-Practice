package com.vamsi.javaPractice;

public class Divisibility {
    public static void main(String[] args) {
        for(int i=0;i<100;i++) {
            if (i % 3 == 0)
                System.out.println ("t");

            else if (i % 5==0)
                System.out.println ("f");
            else if(i%3==0 && i%5==0)
                System.out.println ("x");
        }
    }
}
