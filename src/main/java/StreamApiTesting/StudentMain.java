package StreamApiTesting;



import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        List<StudentDemo> students=new ArrayList<> ();
        students.add(new StudentDemo("Smith","John",80));
        students.add(new StudentDemo("Dean","James",50));
        students.add(new StudentDemo("Sai","Vamsi",90));
        StudentImplementation studentImplementation=new StudentImplementation ();
        System.out.println (studentImplementation.countStudents (students));
        System.out.println (studentImplementation.getName (students));
    }
}
