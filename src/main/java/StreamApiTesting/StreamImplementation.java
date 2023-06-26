package StreamApiTesting;

import com.vamsi.javaPractice.StreamApiTesting.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamImplementation {
    public int sumAge(List<com.vamsi.javaPractice.StreamApiTesting.Person> list){
       return list.stream ().mapToInt (e->e.getAge ()).sum ();

    }
    public  List<String> printName(List<com.vamsi.javaPractice.StreamApiTesting.Person> list){
       return  list.stream ().map(name->name.getName ()).collect(Collectors.toList());
    }

    public List<Integer> printAge(List<com.vamsi.javaPractice.StreamApiTesting.Person> list){
        return list.stream ().map (age->age.getAge ()).collect(Collectors.toList ());
    }

    public static void main(String[] args) {
        com.vamsi.javaPractice.StreamApiTesting.Person p=new com.vamsi.javaPractice.StreamApiTesting.Person("Perry",23);
        com.vamsi.javaPractice.StreamApiTesting.Person p1=new com.vamsi.javaPractice.StreamApiTesting.Person("Ferry",12);
        com.vamsi.javaPractice.StreamApiTesting.Person p2=new com.vamsi.javaPractice.StreamApiTesting.Person("Katty",10);
        com.vamsi.javaPractice.StreamApiTesting.Person p3=new com.vamsi.javaPractice.StreamApiTesting.Person("Elly",15);
        List<Person>list= Arrays.asList (p,p1,p2,p3);
        StreamImplementation streamImplementation=new StreamImplementation ();
        System.out.println (streamImplementation.sumAge (list));
        System.out.println (streamImplementation.printName (list));
        System.out.println (streamImplementation.printAge (list));

    }
}
