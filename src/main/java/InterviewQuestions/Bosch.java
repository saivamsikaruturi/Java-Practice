package InterviewQuestions;

import java.util.*;
import java.util.stream.Stream;

public class Bosch {
    public static void main(String[] args) {
//        ArrayList<Integer> objects = new ArrayList<> ();
//        for(int i=0;i<=1000;i++){
//            objects.add(i);
//        }
//        objects.stream ().filter (e->e%2!=0).limit (100).forEach (System.out::println);

        Stream.iterate (1,n->n+2).limit (100).forEach (System.out::println);
        String s="vamsi";
        String reverse="";
        for(int i=s.length ()-1;i>=0;i--){
            reverse+=s.charAt (i);
        }
        System.out.println (reverse);

        String s1="jajvaabbaj";
        Map<Character,Integer> map=new HashMap<> ();
        int first=0;
        for(int i=0;i<s1.length ()-1;i++){
            if (map.get (s1.charAt (i)) == null) {

                map.put(s1.charAt (i),1);

            }
            else{
                map.put(s1.charAt (i),map.get(s1.charAt (i))+1);
            }
            if(map.get(s1.charAt (i))>first ) {
                first = map.get (s1.charAt (i));
                if(first>=2) {
                    System.out.println (s1.charAt (i));
                    break;
                }
            }

        }


    }
}
