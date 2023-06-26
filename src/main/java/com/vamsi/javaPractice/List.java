package com.vamsi.javaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class List<I extends Number> {
    public static void main(String[] args) throws Exception {
        java.util.List<Integer> integers = Arrays.asList (2, 4, 5, 6, 8, 9, 11, 13, 15, 21);
        java.util.List<Integer> integers1 = Arrays.asList (2, 5, 7, 10, 14, 15, 20);
        java.util.List<Integer> collect3 = integers.stream ().filter (integers1::contains).collect (Collectors.toList ());
        ArrayList<Object> objects = new ArrayList<> ();
        System.out.println (collect3);
       objects.addAll (integers1);
       objects.addAll (integers);
        objects.removeAll (collect3);
        System.out.println (objects);
        java.util.List<Integer> integers2 = Arrays.asList (null, null, 0);
        java.util.List<Integer> collect = integers2.stream ().collect (Collectors.toList ());
        System.out.println (collect);
        try{
            int a=10/0;
        }
        catch(Exception e){
            try{
            }
            catch(Exception e1){
            }
            throw new Exception ();
        }
        finally{

        }
    }
}
