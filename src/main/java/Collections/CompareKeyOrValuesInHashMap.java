package Collections;


import java.util.HashMap;
import java.util.Map;

public class CompareKeyOrValuesInHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> integerHashMap=new HashMap<> ();
        integerHashMap.put ("I",1);
        integerHashMap.put ("TWO",4);
        integerHashMap.put ("THREE",70);
      integerHashMap.entrySet ().stream ().sorted(Map.Entry.comparingByValue()).map(e->e.getValue ()).forEach (System.out::println);

       integerHashMap.entrySet ().stream ().sorted ((x1,x2) -> x1.getValue ().compareTo (x2.getValue ())).forEach (h -> System.out.println (h.getValue ()));

    }
}
