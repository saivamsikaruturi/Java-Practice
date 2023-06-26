package com.vamsi.javaPractice.tdd;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class MethodsByOrder {

    @Test
    void testA(){
        System.out.println("A");
    }
    @Test
    void testD(){
        System.out.println("D");
    }

//    @Test
//    void testA(){
//        System.out.println("A");
//    }

    @Test
    void testC(){
        System.out.println("C");
    }
    @Test
    void testB(){
        System.out.println("B");
    }
}
