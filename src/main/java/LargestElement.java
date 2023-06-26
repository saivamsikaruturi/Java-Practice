import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LargestElement {
    public static void main(String[] args) {
        int[] array = {12, 5, 7, 100};
        int arraySize = array.length;
        int K = 2;
        Set<Integer> set = new TreeSet<> ();
        for (int i = 0; i < arraySize; i++) {
            set.add (array[i]);
        }
        Iterator<Integer> iterator = set.iterator ();

        while (K > 0) {
            iterator.next ();
            K--;
        }
        System.out.println (iterator.next ());
        LinkedList<Integer> list = new LinkedList<> ();
        list.add (1);
        list.add(2);
        list.add(2);
        list.add(1);
        list.add(3);
        Map<Integer, Long> collect = list.stream ().collect (Collectors.groupingBy (Function.identity (), Collectors.counting ()));
        System.out.println (collect.entrySet ().stream ().filter (e->e.getValue ()>1).collect(Collectors.toList()));


    }

    }
