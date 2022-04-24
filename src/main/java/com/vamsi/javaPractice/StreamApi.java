package com.vamsi.javaPractice;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class StreamApi {


    public static void main(String[] args) {

        /*get max value*/
        Integer integer2 = Arrays.asList (20, 10, 4, 5, 1000).stream ().max (Comparator.comparing (Integer::valueOf)).get ();
        System.out.println (integer2);

        /*Sorting in natural order*/
        List<Integer> collect1 = Arrays.asList (20, 10, 15, 40, 674, 455, 27, 14).stream ().sorted (Comparator.naturalOrder ()).collect (Collectors.toList ());
        System.out.println (collect1);

        /*Sorting in reverse order*/
        List<Integer> collect2 = Arrays.asList (20, 10, 15, 40, 674, 455, 27, 14).stream ().sorted (Comparator.reverseOrder ()).collect (Collectors.toList ());
        System.out.println (collect2);

        /*Limit the given the list */
        Arrays.asList (20, 10, 4, 5, 1000, 8, 9, 7).stream ().limit (5).forEach (System.out::println);

        /*count the no .of elements in a list*/
        long count = Arrays.asList (2018 - 05 - 31, 2022 - 05 - 30, 2026 - 05 - 29, 2030 - 05 - 27, 2033 - 03 - 07, 2018 - 06 - 10, 2022 - 06 - 11, 2026 - 06 - 11, 2030 - 06 - 12, 2033 - 03 - 13, 2018 - 03 - 19, 2022 - 02 - 18, 2026 - 01 - 01).stream ().count ();
        System.out.println (count);


        /*sum all the elements in the list*/
        List<Integer> sum = Arrays.asList (1, 7, 8, 9, 5, 2, 36, 4, 78, 222, 24, 9, 2);
        int sum1 = sum.stream ().mapToInt (e -> e.intValue ()).sum ();
        System.out.println (sum1);
        sum.stream ().mapToInt (e->e.intValue ());


        /*average of all the elements in the list*/
        Double average = sum.stream ().mapToDouble (e -> e.doubleValue ()).average ().getAsDouble ();
        Double asDouble = sum.stream ().map (e -> e * e).filter (q -> q > 1000).mapToDouble (e -> e.doubleValue ()).average ().getAsDouble ();
        System.out.println (average);
        System.out.println (asDouble);

        /*get even elements in the list*/
        List<Integer> even = sum.stream ().filter (e -> e % 2 == 0).collect (Collectors.toList ());
        System.out.println (even);

        /*get odd elements in the list*/
        List<Integer> odd = sum.stream ().filter (e -> e % 3 == 0).collect (Collectors.toList ());
        System.out.println (odd);

        /*get elements starts with "2" in the list*/
        List<String> collect3 = sum.stream ().map (sr -> sr + "").filter (se -> se.startsWith ("2")).collect (Collectors.toList ());
        System.out.println (collect3);

        /*get non-unique or repeated elements  in the list*/
        Set<Integer> items = new HashSet<> ();
        List<Integer> collect4 = sum.stream ().filter (n1 -> !items.add (n1)).collect (Collectors.toList ());
        System.out.println ("collect4" + collect4);

        /*get sum of first 5 elements  in the list*/
        Integer integer3 = sum.stream ().limit (5).reduce ((x1, y) -> (x1 + y)).get ();
        System.out.println (integer3);


        /*get sum by skipping first 5 elements in the list*/
        Integer integer4 = sum.stream ().skip (5).reduce ((x1, y) -> (x1 + y)).get ();
        System.out.println (integer4);

        /*get cubes of all elements in the list*/
        System.out.println (sum.stream ().map (e -> e * e * e).collect (Collectors.toList ()));


        Employee e = new Employee (46050451, "Sai Vamsi", 23, "Male", "Java", LocalDate.of (2020, 12, 15), 27000);
        Employee e1 = new Employee (46050452, "Vamsi", 24, "Male", "Java", LocalDate.of (2020, 12, 15), 27000);
        Employee e2 = new Employee (46050453, "Rashmi", 33, "Female", "Full Stack", LocalDate.of (2014, 12, 15), 120000);
        Employee e3 = new Employee (46050454, "Gayatri", 25, "Female", "Data Base", LocalDate.of (2017, 01, 01), 27000);
        Employee e4 = new Employee (46050455, "Need Smith", 28, "Male", "UI", LocalDate.of (2018, 12, 15), 70000);

        List<Employee> employeeList = Arrays.asList (e, e1, e2, e3, e4);


        /*get count of all Male employees in the list*/

        long count1 = employeeList.stream ().filter (emp -> emp.getEmpGender () == "Male").count ();
        System.out.println (count1);

        /*get count of all Female employees in the list*/

        long count2 = employeeList.stream ().filter (emp -> emp.getEmpGender () == "Female").count ();
        System.out.println (count2);

        /*get all Departments in the list*/

        List<String> depts = employeeList.stream ().map (emp -> emp.getEmpDept ()).collect (Collectors.toList ());
        System.out.println (depts);

        /*get sum of age of all Male Employee in the list*/

        Integer ageofMale = employeeList.stream ().filter (emp -> emp.getEmpGender () == "Male").map (age -> age.getEmpAge ()).reduce ((age1, age2) -> (age1 + age2)).get ();
        System.out.println (ageofMale);


        /*get average of age of all Female Employee in the list*/

        Double ageofFemale = employeeList.stream ().filter (emp -> emp.getEmpGender () == "Female").map (age -> age.getEmpAge ()).mapToDouble (age1 -> age1.doubleValue ()).average ().getAsDouble ();

        System.out.println (ageofFemale);

        /*get salaries of all Employee in Higher order in the list*/

        Employee list = employeeList.stream ().sorted (Comparator.comparingDouble (Employee::getSalary).reversed ()).collect (Collectors.toList ()).get (0);
        System.out.println (list);

        /*get Employees joined after a particular date in the list*/

        List<String> collect5 = employeeList.stream ().filter (elist -> elist.getDoj ().isAfter (LocalDate.of (2017, 01, 01))).map (Employee::getEmpName).collect (Collectors.toList ());
        System.out.println (collect5);

        /*get Employee who is small in age in the list*/

        String collect6 = employeeList.stream ().sorted (Comparator.comparing (Employee::getEmpAge)).map (age1 -> age1.getEmpName ()).collect (Collectors.toList ()).get (0);
        System.out.println (collect6);

        /*get Employee who age is less than 25 in the list*/

        List<String> agelessthan25 = employeeList.stream ().filter (lessage -> lessage.getEmpAge () <= 25).map (Employee::getEmpName).collect (Collectors.toList ());
        System.out.println (agelessthan25);

        /*get 2nd Highest Salary in the list*/

        Integer secondHighestSalary = employeeList.stream ().sorted (Comparator.comparingDouble (Employee::getSalary).reversed ()).map (employee -> employee.getSalary ()).collect (Collectors.toList ()).get (1);
        System.out.println (secondHighestSalary);


        /*Reduce operation*/
        List<Integer> g = Arrays.asList (2, 3, 1, 3, 2, 2,4,5,5);
        Optional<Integer> reduce2 = g.stream ().reduce ((x1, x2) -> x1 + x2);
        System.out.println (reduce2);
        Set<Integer> collect = g.stream ().filter (reduce -> Collections.frequency (g, reduce) > 1).collect (Collectors.toSet ());
        System.out.println ("frequency"+collect);


        List<String> names = Arrays.asList ("nani", "vamsi", "varanasi", "lokesh");
        names.stream ().filter (q -> q.startsWith ("v")).map (q -> q.concat ("1")).forEach (System.out::println);
        names.stream ().sorted (Comparator.reverseOrder ()).forEach (System.out::println);
        Optional<String> reduce = names.stream ()
                .reduce ((word1, word2)
                        -> word1.length () > word2.length ()
                        ? word1 : word2);
        System.out.println (reduce);
        Optional<String> reduce1 = names.stream ()
                .reduce ((str1, str2) -> str1 + "-" + str2);
        System.out.println (reduce1);

        System.out.println(Arrays.asList(1,2,3,4,5,6,7,8,9,10).stream ().filter (num->num%2==0).mapToInt (n->n*2).sum ());


      //anyMatch
        List<String> names1 = Arrays.asList ("nani", "vamsi", "varanasi vamsi", "lokesh");
        boolean vamsi = names1.stream ().anyMatch (i -> i.equals ("vamsi"));
        System.out.println (vamsi);



    }
}
