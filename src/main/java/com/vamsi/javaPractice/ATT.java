package com.vamsi.javaPractice;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class ATT {
    public static void main(String[] args) {
        String s="Karuturi Sai Naga Vamsi Krishna";
//        String[] split = s.toLowerCase().split ("");
//        Map<String,Integer> map=new HashMap<> ();
//        for(String element :split){
//            if(map.get(element)==null){
//              map.put(element,1);
//            }
//            else{
//                map.put(element,map.get(element)+1);
//            }
//        }
//        map.entrySet ().stream ().forEach (System.out::println);
        String s1="my name is vamsi";
        String result="";

        String[] s2 = s1.split (" ");
        for(String element : s2){
            String word="";
            for(int i=element.length ()-1;i>=0;i--) {
                word =word+ element.charAt (i);

            }

            result=result+word+" ";
        }

        System.out.print (result);

    }
}
