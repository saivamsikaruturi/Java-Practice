import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Highest {
    public static void main(String[] args) {
        int[]array={1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4};
        Map<Integer,Integer> map=new HashMap<> ();
        for(int a:array) {
            if (map.get (a) == null) {
                map.put (a, 1);
            } else {
                map.put (a, map.get (a) + 1);
            }
        }

        map.entrySet ().stream ().filter (e -> e.getValue () > 1).max (Comparator.comparing (Map.Entry::getValue)).stream().mapToInt (e->e.getKey ()).findFirst ().getAsInt ();
        List<Map.Entry<Integer, Integer>> collect = map.entrySet ().stream ().filter (e -> e.getValue () > 1).collect (Collectors.toList ());

    }
}
