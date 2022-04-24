package com.vamsi.javaPractice;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class DepartmentTest {
    public static void main(String[] args) {
        List<Department> departments=new ArrayList<> ();
        departments.add(new Department (1,"EEE", Arrays.asList ("PE","Machine")));
        departments.add(new Department (2,"CSE",Arrays.asList ("DataScience","C")));
        departments.add(new Department (3,"EEE",Arrays.asList ("FMHM","PS")));
        List<String> collect = departments.stream ().flatMap (s -> s.getLabs ().stream ()).collect (Collectors.toList ());
     System.out.println (collect);
     List<Integer>list=Arrays.asList (1,2,3,4,5,6,7,8,9,10);
        Integer reduce = list.stream ().reduce (0, Integer::sum);
        System.out.println (reduce);
        Map<String, List<Department>> collect1 = departments.stream ().collect (Collectors.groupingBy (Department::getName));
         System.out.println (collect1.keySet ());
        Employee emp1= new Employee (1,"Sai",23,"Male","NA AS CSD", LocalDate.now (),35000);
        Employee emp2=new Employee (2,"Rashmi" ,29,"Female","FS",LocalDate.now (),1000000);
        Employee emp3=new Employee (3,"Gayatri",23,"Female","NA AS CSD",LocalDate.now(),250000);
       List<Employee> employeeList=Arrays.asList (emp1,emp2,emp3);
        Integer reduce1 = employeeList.stream ().map (Employee::getSalary).reduce (0, Integer::sum);
        System.out.println (reduce1);
        Map<String, Double> collect2 = employeeList.stream ().collect (Collectors.groupingBy (Employee::getEmpDept, Collectors.summingDouble (Employee::getSalary)));
       System.out.println (collect2);
        Map<String, Employee> collect3 = employeeList.stream ()
                .collect (Collectors.groupingBy (
                        Employee::getEmpDept
                        , Collectors.collectingAndThen (Collectors.maxBy (Comparator.comparingInt (Employee::getSalary)), Optional::get)));
collect3.entrySet ().forEach (s->System.out.println (s.getKey ()+" "+s.getValue ().getSalary ()));

    LinkedList<Integer> linkedList=new LinkedList<> ();
    linkedList.add(1);
    linkedList.addFirst (2);
    linkedList.addLast (5);
    linkedList.add(6);
    linkedList.remove (3);
    System.out.println (linkedList);
    List<String>list1=Arrays.asList ("sai","sai","test","Rashmi","Prem");
    SortedSet<String> sortedSet=new TreeSet<> ();
    sortedSet.addAll (list1);
        System.out.println (sortedSet.first ());
        System.out.println (sortedSet.last ());
        System.out.println (sortedSet.headSet ("test"));
        System.out.println (sortedSet.tailSet ("Rashmi"));
        System.out.println (sortedSet.subSet ("Prem","test"));
    sortedSet.stream ().forEach (System.out::println);
    HashSet<String> set=new HashSet<> ();
    list1.stream ().filter (q->!set.add (q)).sorted (Comparator.reverseOrder ()).forEach (System.out::println);

    List<Integer> getDuplicates=Arrays.asList (10,28,87,10,20,76,28,80);
    HashSet<Integer> integerHashSet=new HashSet<>();
    getDuplicates.stream ().filter (s->!integerHashSet.add (s)).collect(Collectors.toList());

    //count no of times a word is repeated in a string
        String str ="India is a sub continent India has many states";
        List<String>getList=Arrays.asList (str.split (" "));
        Map<String, Long> collect4 = getList.stream ().collect (Collectors.groupingBy (Function.identity (), Collectors.counting ()));
        System.out.println (collect4);

        String str1="aSONYbbb";
        int s=str1.indexOf ("S");
        int o=str1.indexOf ("O");
        int n=str1.indexOf ("N");
        int y=str1.indexOf ("Y");
        if(s+1==o && o+1==n && n+1==y){
            if(str1.length ()/2==o || str1.length ()/2==n){
                System.out.println ("true");
            }
            else{
                System.out.println ("false");
            }
        }
        Scanner sc = new Scanner(System.in);
        String input=sc.next ();
        char[] chars = input.toCharArray ();
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher = pattern.matcher(input);
        boolean isStringContainsSpecialCharacter = matcher.find();
         if(!isStringContainsSpecialCharacter) {
             String replace1 = input.replace ("53", "");

             String replace = replace1.replace ("8", "");
             String s1 = replace.toLowerCase ();
             System.out.println (s1);
         }
         else{
             System.out.println ("Invalid input given ,please remove the characters that are non digitd and alphabets");
         }
         String upperCase="india is my country";
        String[]tt = upperCase.split ("\\s");

        for(String as:tt){
//            System.out.println (as+" ");
            char c = as.charAt (0);
            String substring = as.substring (1, as.length ());
            String s3 = Character.toUpperCase (c) +substring;
            System.out.print (s3+" ");
        }
      String test="Vamsi";
        test.toCharArray();

        int[] array={1,2,3,4,5,3,5,2,1};
       for(int k=0;k<array.length;k++){
           for(int f=k+1;f<array.length;f++){
               if(array[k]==array[f])
                   System.out.println (array[f]+"");
           }

       }
       Runtime r=Runtime.getRuntime ();
        System.out.println (r.freeMemory ());
        System.out.println (r.totalMemory ());
System.out.println ("string alphabets");
        Scanner sc1 = new Scanner(System.in);
        String input1=sc1.next ();
        Pattern pattern1= Pattern.compile("[^a-zA-Z]");
        Matcher matcher1 = pattern1.matcher(input1);
        boolean isStringContainsSpecialCharacter1 = matcher1.find();
        if(!isStringContainsSpecialCharacter1){
            System.out.println ("yes");
        }
        else{
            System.out.println ("No");
        }

        String result="";
        String hello="madam";
        char[] chars1 = hello.toCharArray ();
        for(int v=chars1.length-1;v>=0;v--){
            result+=chars1[v];
        }
        System.out.println ("result"+result);
        if(result.equals (hello)){
            System.out.println ("palindrome");
        }
      //sort an array
        int[] sort={1,6,8,2,3,0};
        for(int c=0;c<sort.length-1;c++){
            for(int x=c+1;x<sort.length-1;x++) {
                if (sort[c] > sort[x]) {
                    int temp = sort[c];
                    sort[c] = sort[x];
                    sort[x] = temp;
                    // c=-1;
                }
            }

        }
        System.out.println (Arrays.toString (sort));
    }


}
