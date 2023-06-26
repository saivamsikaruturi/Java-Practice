package StreamApiTesting;

import com.vamsi.javaPractice.StreamApiTesting.StudentDemo;
import com.vamsi.javaPractice.StreamApiTesting.StudentImplementation;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        List<com.vamsi.javaPractice.StreamApiTesting.StudentDemo> students=new ArrayList<> ();
        students.add(new com.vamsi.javaPractice.StreamApiTesting.StudentDemo("Smith","John",80));
        students.add(new com.vamsi.javaPractice.StreamApiTesting.StudentDemo("Dean","James",50));
        students.add(new StudentDemo("Sai","Vamsi",90));
        StudentImplementation studentImplementation=new StudentImplementation ();
        System.out.println (studentImplementation.countStudents (students));
        System.out.println (studentImplementation.getName (students));
    }
}
