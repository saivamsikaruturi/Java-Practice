package com.vamsi.javaPractice;

public class ReverseAStringByReversingEveryCharacterInAWord {
    public static void main(String[] args) {
        String input="how are you";
        String rev= "";

        String[] str = input.split(" ");
        for(String a: str){
            String word="";
            for(int i=a.length()-1;i>=0;i--){
                word=word+a.charAt (i);
            }
            rev= rev+word+" ";
        }

        System.out.println (rev);


        String rev1="";
        String[] str1 = input.split(" ");
            String word1="";
            for(int i=str1.length-1;i>=0;i--){
                word1=str[i];
            rev1= rev1+word1+" ";
        }

        System.out.println (rev1);

        String[] str2 = input.split(" ");
        int i=0;
        String resv="";
        for( i=str2.length-1;i>=0;i--){
            String word2="";
            for(int j=str2[i].length();j>0;j--){
                word2=word2+str2[i].charAt (j-1);
            }
            resv =resv+word2+" ";
        }

        System.out.println (resv);

    }
}
