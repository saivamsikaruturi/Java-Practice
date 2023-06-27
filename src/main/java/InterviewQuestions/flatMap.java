package InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatMap {
    public static void main(String[] args) {
        List<Integer> primeNumbers = Arrays.asList (3,5,7,11,13);
        List<Integer> oddNumbers=Arrays.asList (1,3,5,7);
        List<Integer>evenNumbers =Arrays.asList (2,4,6,8,10);
        List<List<Integer>> singleList=Arrays.asList (primeNumbers,oddNumbers,evenNumbers);
        System.out.println (singleList);
        List<Integer> collect = singleList.parallelStream ().flatMap (list -> list.stream ()).collect (Collectors.toList ());
        System.out.println (collect);
    }
  
}
