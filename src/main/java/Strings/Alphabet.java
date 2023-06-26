package Strings;

import java.util.HashSet;
import java.util.Set;


public class Alphabet {
   public int uniqueVowel(String str){
       str = str.toLowerCase();
       Set<Character> setOfUsedChars = new HashSet<> ();
       for (int i = 0; i < str.length(); i++) {
           if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                   || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
               setOfUsedChars.add(str.charAt(i));
           }
       }
       return setOfUsedChars.size();

   }
    public int uniqueConsonant(String str){
        int count = 0;
        for (int i=0 ; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch != 'a' && ch != 'e' && ch!='i'&& ch!='o'&& ch!='u' ){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Alphabet obj =new Alphabet ();
        System.out.println ( obj.uniqueVowel ("abacebei"));
        System.out.println (obj.uniqueConsonant ("abacab"));
    }
}
