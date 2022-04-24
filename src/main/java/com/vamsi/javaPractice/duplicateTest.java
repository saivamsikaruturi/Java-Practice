package com.vamsi.javaPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class duplicateTest {
    public static void main(String[] args) {
        List<String> test= Arrays.asList ("test","sai","krishna","sai","you","test");
        HashSet<String>hashSet=new HashSet<> ();
        List<String> collect = test.stream ().filter (t -> !hashSet.add (t)).collect (Collectors.toList ());
        System.out.println (collect);
        List<Integer>test1=Arrays.asList (1,2,5,6,7,3,0);
       test1.parallelStream ().forEach (System.out::println);
    }
}
