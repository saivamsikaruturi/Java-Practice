import java.util.*;
import java.util.stream.Collectors;

public class Encora {
    public static void main(String[] args) {
       List<Integer> list= Arrays.asList (10,30,50,80,20);
       list.stream ().sorted(Comparator.comparing(Integer::intValue).reversed ()).forEach (System.out::println);
       String s="My Name is AAAABBCCCCDDDDD";
       //find 2nd largest character in the string
        char[] chars = s.trim ().toCharArray ();
        Map<Character,Integer> map=new LinkedHashMap<> ();
        for(Character ch :chars) {
            if (map.get (ch) == null) {
                map.put (ch, 1);
            } else {
                map.put (ch, map.get (ch) + 1);
            }
        }

       map.entrySet ().stream().sorted(Map.Entry.<Character,Integer>comparingByValue ().reversed ())
               .map(e->e.getKey ()).skip(1).limit(1).forEach (System.out::println);

    }
}
