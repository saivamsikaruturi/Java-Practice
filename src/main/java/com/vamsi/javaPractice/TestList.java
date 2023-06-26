package com.vamsi.javaPractice;

public class TestList extends Parent{
    void print(){
        System.out.println ("test method");
    }
    void te4(){
        System.out.println ("l");
    }

    public static void main(String[] args) {
//        Parent p=new Parent ();
//        p.print ();
        TestList t=new TestList ();
        t.print ();
        t.te4 ();
        Parent p1=new TestList ();
        TestList t1=(TestList) p1;
        t1.print ();
        t1.test ();
    }
}
