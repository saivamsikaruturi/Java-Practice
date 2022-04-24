package com.vamsi.javaPractice.Strings;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class DisplayVowels {
    public static void main(String[] args) {
        String test="solid";
        char[] chars = test.toCharArray ();
        List<Character> list= Arrays.asList ('a','e','i','o','u');
        for(int i=0;i<chars.length;i++){
            if(list.contains (chars[i]))
                System.out.println (chars[i]);
        }
    }
}
