package StreamApiTesting;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamImplementation {
    public int sumAge(List<Person> list){
       return list.stream ().mapToInt (e->e.getAge ()).sum ();

    }
    public  List<String> printName(List<Person> list){
       return  list.stream ().map(name->name.getName ()).collect(Collectors.toList());
    }

    public List<Integer> printAge(List<Person> list){
        return list.stream ().map (age->age.getAge ()).collect(Collectors.toList ());
    }

    public static void main(String[] args) {
        Person p=new Person("Perry",23);
        Person p1=new Person("Ferry",12);
        Person p2=new Person("Katty",10);
        Person p3=new Person("Elly",15);
        List<Person>list= Arrays.asList (p,p1,p2,p3);
        StreamImplementation streamImplementation=new StreamImplementation ();
        System.out.println (streamImplementation.sumAge (list));
        System.out.println (streamImplementation.printName (list));
        System.out.println (streamImplementation.printAge (list));

    }
}
