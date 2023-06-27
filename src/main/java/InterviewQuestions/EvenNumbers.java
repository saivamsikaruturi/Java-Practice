package InterviewQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList (1,2,3,4,5,6,7,8,8,10);
        List<Integer> collect = list.stream ().filter (e -> e % 2 == 0).collect (Collectors.toList ());
        list.stream ().sorted (Comparator.naturalOrder ()).collect(Collectors.toList());
        System.out.println (collect);
        String s="abc";
        String a=new String("abc");
        System.out.println (s==a);
        Group group=new Group (1,"test",23);
        Group group1=new Group (2,"test3",40);
        Group group2=new Group (4,"test5",23);
        List<Group>test1=Arrays.asList (group,group1,group2);
        Map<Integer, List<Group>> collect1 = test1.stream ().collect (Collectors.groupingBy (Group::getAge));
        System.out.println (collect1);


    }
}
