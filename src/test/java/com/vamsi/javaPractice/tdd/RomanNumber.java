package com.vamsi.javaPractice.tdd;

import java.util.HashMap;
import java.util.Map;

public class RomanNumber {
   private Map<String,Integer> map;
    public RomanNumber() {
        map=new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
    }

    public int convert(String s) {
        int result=0;
        for(int i=0;i<s.length();i++){
            int right=0;
            if(i<s.length()-1) {
                String substring = s.substring(i + 1, i + 2);
               right=map.get(substring);
            }
           int current = map.get(String.valueOf(s.charAt(i)));
            if(right>current){
                current*=-1;
            }
            result+=current;
        }
     return result;
    }
}
