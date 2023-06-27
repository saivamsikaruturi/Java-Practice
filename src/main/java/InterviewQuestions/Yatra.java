package InterviewQuestions;

import java.time.LocalDateTime;
import java.util.*;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Yatra {
    public static void main(String[] args) {
        //Java Program to reverse ArrayList
        java.util.List<Integer> list= Arrays.asList (1,2,3);
        java.util.List<Integer> list1=new ArrayList<> ();
        for(int i=list.size ()-1;i>=0;i--){
            list1.add(list.get (i));
        }
        System.out.println (list1);
        //Explain with example LocalDateTime APIs.
        System.out.println (LocalDateTime.now ().plusDays (1));
        java.util.List<String> list2=Arrays.asList ("Mango", "Apple", null, "Grapes");
        list2.stream ().filter (e->e!=null).forEach (System.out::println);
     //   list2.stream ().filter (e->e.equals("test")).findFirst ().orElseThrow (ArithmeticException::new);
        java.util.List<Integer> list3 =Arrays.asList (10,15,8,49,25,98,98,32,15);
        Set<Integer> set=new HashSet<> ();
        List<Integer> collect = list3.stream ().filter (e -> set.add (e)).collect (Collectors.toList ());
        System.out.println (collect);
//        {
//            "address": {
//            "addressLines":[
//            "National Highway - 1"
//            ],
//            "city":"Amritsar",
//                    "area":"G T Road",
//                    "pincode":"143001",
//                    "stateCode":"Punjab",
//                    "country":"India"
//        }
//        }
//
//        @OneToManyMapping()
//        private Address address;
//        @Coloumn("")
//        private String city;
//        private String area;
//        private String pincode;
//        private String stateCode;
//        private String country;


//        public class C extends B{
//            public C(){
//                System.out.println("C constructor");
//            }
//            public static void main(String[] args){
//                C c= new C();
//                System.out.println("Hello Java World");
//            }
//        }
//        class B extends A{
//            public B(){
//                System.out.println("B constructor");}}
//
//        class A{
//            public A(){
//                System.out.println("A constructor");
//            }
//        }

    }
}
