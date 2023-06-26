package com.vamsi.javaPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Test123 {
    public static void main(String[] args) {
        String w1="aab";
        String w2="abb";

       Map<Character,Integer> map=new ConcurrentHashMap<> ();
        for(Character c: w1.toCharArray ()) {
            if (map.get (c) == null) {
                map.put (c, 1);
            } else {
                map.put (c, map.get (c) + 1);
            }
        }

          Map<Character, Integer> map1 = new ConcurrentHashMap<> ();
            for (Character c1 : w2.toCharArray ()) {
                if (map1.get (c1) == null) {
                    map1.put (c1, 1);
                } else {
                    map1.put (c1, map.get (c1) + 1);
                }

            }


      AtomicInteger count1= new AtomicInteger ();
        map.entrySet ().forEach (e -> {
            map1.entrySet ().forEach (f -> {
                if ( f.getKey ()==e.getKey ()&& f.getValue ()==e.getValue ()){
                   map.remove (e.getKey (),e.getValue ());
                   map1.remove (e.getKey (),e.getValue ());
                }
            });
        });
        System.out.println (map);

        System.out.println (map1);
        if(map1.entrySet ().size ()==1 && map.entrySet ().size ()>=1)
            System.out.println (true);
        else
            System.out.println (false);
    }
}
