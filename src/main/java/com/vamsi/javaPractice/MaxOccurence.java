package com.vamsi.javaPractice;

import java.util.*;
import java.util.stream.Stream;

public class MaxOccurence {
    public static void main(String[] args) {
//        int[] array={2,3,1,3,2};
//        Map<Integer,Integer> map=new HashMap<> ();
//        for(int i=0;i<array.length;i++){
//            if(map.get (array[i])==null){
//                map.put(array[i],1);
//            }
//            else{
//                map.put(array[i],map.get(array[i])+1);
//            }
//        }
//        Integer first = map.entrySet ().stream ().sorted (
//                Map.Entry.comparingByValue (Comparator.reverseOrder ())).map (e -> e.getValue ()).limit (1).findFirst ().get ();
//        System.out.println (first);
        String s="acbcba";
        char[] chars = s.toCharArray ();
        Map<Character,Integer> map1=new LinkedHashMap<> ();
        Character maximum=chars[0];
        for(int i=0;i<chars.length;i++){
            if(map1.get(chars[i])==null){
                map1.put(chars[i],1);
            }
            else{
                map1.put(chars[i],map1.get(chars[i])+1);
            }
            if(map1.get(maximum)<map1.get(chars[i])){
                maximum=chars[i];
            }

        }
        System.out.println (maximum);


    }
}
