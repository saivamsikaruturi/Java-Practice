package StreamApiTesting;

import InterviewQuestions.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList (1, 2, 3, 4, 5, 6);
        Map<Integer, Integer> collect = integers.stream ().collect (Collectors.toMap (Integer::intValue, Integer::intValue));
        List<Employee>employees=new ArrayList<> ();
        Employee employee=new Employee (1,"vamsi",24,"Male","JAVA", LocalDate.now (),23000);
        employees.add(employee);
        employees.stream ().collect (Collectors.toMap (Employee::toString,Employee::getEmpAge)).entrySet ().forEach (System.out::println);
        System.out.println (collect);

    }
}
