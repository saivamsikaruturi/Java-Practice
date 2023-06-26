package com.vamsi.javaPractice;

import java.util.*;
import java.util.List;

public class SubjectAndMarks{
    public static void main(String[] args) {
     String[] str={"1-english:45","2-english:45","3-hindi:60","4-english:10"};
      Map<String,List<Integer>>result=new HashMap<> ();
     for(int i=0;i< str.length;i++) {
         int index = str[i].indexOf ("-");
         String marksAndSubject = str[i].substring (index + 1);
         String[] marksAnsSubjectArray = marksAndSubject.split (":");
         if (result.containsKey (marksAnsSubjectArray[0])) {
             List<Integer> integers =result.get (marksAnsSubjectArray[0]);
             integers.add (Integer.parseInt (marksAnsSubjectArray[1]));
         }
         else{
             List<Integer>integers=new ArrayList<> ();
             integers.add (Integer.parseInt (marksAnsSubjectArray[1]));
            result.put(marksAnsSubjectArray[0],integers);
         }
     }
    result.forEach ((subject,marks)->{
         double average = marks.stream ().mapToDouble (e -> e).average ().orElse (0.0);
         System.out.println (subject +" "+average);
     });
     }






}
