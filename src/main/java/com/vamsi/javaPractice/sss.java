package com.vamsi.javaPractice;



public class sss extends ss{
    public sss() {
        System.out.println ("child const");
    }

    public  void getDetails(int id) {
        System.out.println ("child");
    }

    public static void main(String[] args) {
     ss s=new sss();
     s.getDetails (1);
     s.newMethod ();



    }
}
