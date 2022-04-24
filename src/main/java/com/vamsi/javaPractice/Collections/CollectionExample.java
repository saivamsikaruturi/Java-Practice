package com.vamsi.javaPractice.Collections;

import java.util.HashSet;
import java.util.Set;

public class CollectionExample {

  public static Set<Integer> unionOfElements(Set<Integer> s1, Set<Integer> s2){
     Set<Integer> hashSet=new HashSet<> (s1);
   hashSet.addAll (s2);
   return hashSet;
  }

    public static Set<Integer> intersectionOfElements(Set<Integer> s1, Set<Integer> s2){
        Set<Integer> hashSet=new HashSet<> (s1);
        hashSet.retainAll (s2);
        return hashSet;
    }

    public static Set<Integer> subtractionofElements(Set<Integer>s1, Set<Integer> s2){
        Set<Integer> hashSet=new HashSet<> (s1);
        hashSet.removeAll (s2);
        return hashSet;
    }
    public static void main(String[] args) {
        Set<Integer> s1=new HashSet<> ();
        s1.add(5);
        s1.add(6);
        s1.add(7);
        Set<Integer> s2=new HashSet<> ();
        s2.add(9);
        s2.add(3);
        s2.add(7);


        System.out.println (unionOfElements (s1,s2));
        System.out.println (intersectionOfElements (s1,s2));
        System.out.println (subtractionofElements (s1,s2));
    }
}
