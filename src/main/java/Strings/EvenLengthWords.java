package Strings;

import java.util.Arrays;

public class EvenLengthWords {
   public static void getEvenLengthWords(String s){

       String[] split = s.split (" ");
       for(int i=0;i<split.length;i++){
           if((split[i].length ())%2==0){
               System.out.println (split[i]);
           }
       }

   }

    public static void main(String[] args) {
       getEvenLengthWords ("Hello World");
    }
}
