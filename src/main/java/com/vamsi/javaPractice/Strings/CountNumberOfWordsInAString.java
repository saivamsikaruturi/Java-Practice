package com.vamsi.javaPractice.Strings;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfWordsInAString {
    public static  int countNumberOfWords(String str){
        int count=0;
        String[] split = str.split ("\\s+");
          for(int i=0;i<split.length;i++){
              count++;
          }
        return count;
    }
    public static int getCountOfCharacter(String str ,Character ch){
        int count=0;
        char[] chars = str.toCharArray ();
        for(int i=0;i<str.length ();i++){
            if(chars[i]==ch){
                count++;
            }
        }
        return count;
    }
    public static String reverseAString(String str){
       String s="";
        char[] chars = str.toCharArray ();
        for(int i=chars.length-1;i>=0;i--){
           s+=chars[i];
        }
        return s;
    }

    public static void getFirstNonRepeatableCharacter(String str){
        Map<Character, Integer> map=new HashMap<> ();
        char[] chars = str.toCharArray ();
        for(int i=0;i<str.length ()-1;i++){
            if(map.get(chars[i])==null){
                map.put(chars[i],1);
            }
            else{
                map.put(chars[i],map.get(chars[i])+1);
            }
        }
        map.entrySet().stream().filter (e->e.getValue ()==1).map (e->e.getKey ()).forEach(System.out::println);
        map.entrySet ().stream ().map(e->e.getValue ()).mapToInt (e->e.intValue ()).sum ();
    }
    public static void main(String[] args) {
        System.out.println (countNumberOfWords ("Hi ,All I am Vamsi"));
        System.out.println (getCountOfCharacter ("Sai Vamsi",'a'));
        System.out.println (reverseAString ("Vamsi"));
        getFirstNonRepeatableCharacter ("Vamsi Krishna");
    }
}
