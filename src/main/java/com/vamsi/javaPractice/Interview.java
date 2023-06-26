package com.vamsi.javaPractice;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Interview {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println (a);
        System.out.println (b);

        String str1="Vamsi";
        String str2="Krishna";
      str1= str1.concat (str2);

        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());
        System.out.println (str1);
      System.out.println (str2);



    }
}
