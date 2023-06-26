import java.util.*;
import java.util.stream.Collectors;

public class Siemens1 {
    public static void main(String[] args) {

      //a program to reverse  each word of a string preserving the position of spaces
        String s="Java is platform independent language";
        String[] s1 = s.split (" ");
        String reverse="";
        for(int i=s1.length-1;i>=0;i--){
            reverse+=s1[i]+" ";
        }
        System.out.println (reverse);
        System.out.println (compute (5));

    }
    public static int compute(int n){
        if(n==-5)
            return -1;
        return n*compute (n-1);
    }


}
