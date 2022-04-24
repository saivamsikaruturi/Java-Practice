package com.vamsi.javaPractice.Strings;

import java.util.HashMap;
import java.util.HashSet;


public class Isogram {
    public static boolean iSIsogram(String str){
        char[] chars = str.toCharArray ();
        HashMap<Character,Integer>hashMap=new HashMap<> ();
        for(char ch:chars){
            if(hashMap.get(ch)==null)
                hashMap.put (ch,1);
            else
                hashMap.put(ch,hashMap.get(ch)+1);
        }
      return hashMap.entrySet ().stream ().allMatch (e -> e.getValue () ==1);



    }
    public static boolean Isogram(String str){
        char[] chars = str.toCharArray ();
        HashSet<Character>hashSet=new HashSet<> ();
        for(char ch:chars){
            if(hashSet.contains (ch))
               return false;
            else
                hashSet.add (ch);
        }


     return true;
    }

    public static void main(String[] args) {
        System.out.println (Isogram.iSIsogram ("CodeDecode"));
        System.out.println (Isogram.Isogram ("CodeDecode"));
    }
}
