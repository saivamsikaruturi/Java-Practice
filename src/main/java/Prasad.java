import java.util.*;
import java.util.stream.Collectors;

public class Prasad {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList (1, 7, 8, 9, 5, 2, 36, 4, 78, 222, 24, 9);
        int sum = list.stream ().mapToInt (e -> e).sum ();
        System.out.println (sum);
        double asDouble = list.stream ().mapToInt (e -> e).average ().getAsDouble ();
        System.out.println (asDouble);
        double asDouble1 = list.stream ().mapToInt (e -> e * e).filter (e -> e > 100).average ().getAsDouble ();
        System.out.println (asDouble1);
        List<Integer> evenNumbers = list.stream ().filter (even -> even % 2 == 0).collect (Collectors.toList ());
        System.out.println (evenNumbers);
        List<Integer> oddNumbers = list.stream ().filter (even -> even % 3 == 0).collect (Collectors.toList ());
        System.out.println (oddNumbers);
        List<String> numbersStartingwithTwo = list.stream ().map (s -> s + "").filter (e -> e.startsWith ("2")).collect (Collectors.toList ());
        System.out.println (numbersStartingwithTwo);
        Set<Integer> duplicates = new HashSet<> ();
        List<Integer> duplicate = list.stream ().filter (n1 -> !duplicates.add (n1)).collect (Collectors.toList ());
        System.out.println (duplicate);
        Integer maximumElement = list.stream ().max (Integer::compare).get ();
        System.out.println (maximumElement);
        Integer minimumElement = list.stream ().min (Integer::compare).get ();
        System.out.println (minimumElement);
        List<Integer> ascendingOrder = list.stream ().sorted (Comparator.naturalOrder ()).collect (Collectors.toList ());
        System.out.println (ascendingOrder);
        List<Integer> descendingOrder = list.stream ().sorted (Comparator.reverseOrder ()).collect (Collectors.toList ());
        System.out.println (descendingOrder);
        int sumofFirstFiveNumbers = list.stream ().limit (5).mapToInt (e -> e).sum ();
        int sumBySkippingFirstFive = list.stream ().skip (5).mapToInt (e -> e).sum ();
        List<Integer> cubeofAllNumbers = list.stream ().map (cube -> cube * cube * cube).collect (Collectors.toList ());
        System.out.println (cubeofAllNumbers);


        List<String> ls = Arrays.asList ("Ravi", "Sai", "Rashmi","","");
        List<String> collect = ls.parallelStream ().filter (e -> e.length () >= 1).collect (Collectors.toList ());
        System.out.println (collect);

    }
    
}