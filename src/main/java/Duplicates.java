import java.util.*;
import java.util.stream.Collectors;

public class Duplicates {
    public static void main(String[] args) {
        //   Print 3rd largest element from an unsorted and duplicated Integer array (min size of array is 3)
        List<Integer> test = Arrays.asList (3, 2, 5, 8, 4, 9, 10, 10, 10, 22, 22, 9, 22, 103, 103, 4, 2, 1, 2, 3, 0, 5);
        HashSet<Integer> hashSet = new HashSet<> ();
        Integer integer = test.stream ().filter (t -> !hashSet.add (t)).sorted (Comparator.reverseOrder ()).collect (Collectors.toList ()).get (3);
        System.out.println (integer);
    }
    }

