package com.vamsi.javaPractice;

import java.util.HashMap;
import java.util.Iterator;

public class ConcurrentModificationExceptionDemo {
    public static void main(String[] args) {
        HashMap<String,String>hashMap=new HashMap<> ();
        hashMap.put ("1","one");
        hashMap.put("2","two");
        Iterator<String> iterator = hashMap.keySet ().iterator ();
        while(hashMap.keySet ().iterator ().hasNext ()){
            String key= iterator.next ();
            System.out.println (key);
            if(key.equals ("2"))
                hashMap.put("3","three");
        }
        System.out.println (hashMap);
    }
}
