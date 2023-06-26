package StreamApiTesting;

import com.vamsi.javaPractice.StreamApiTesting.EmployeeDetails;

import java.util.*;

public class EmployeeInfo {
   enum SortedMethod {
        BYNAME, BYSALARY
    }
    public static List<EmployeeDetails> sort(List<EmployeeDetails> emps, final SortedMethod method) {
       if(method.equals ("BYNAME")) {
           Collections.sort (emps, new Comparator<EmployeeDetails> () {
               @Override
               public int compare(EmployeeDetails o1, EmployeeDetails o2) {
                   return o1.getName ().compareTo (o2.getName ());
               }
           });
       }
       else {
           Collections.sort (emps, Comparator.comparingInt (EmployeeDetails::getEmpSalary));
       }
        return emps;
    }

    public  EmployeeDetails getThirdInCollection(Collection<EmployeeDetails> entities){
       return entities.stream ().skip (2).findFirst ().get ();
    }

    public boolean isCharacterPresentInAllNames(Collection<EmployeeDetails> entities, String character){
        return   entities.stream ().anyMatch (e->e.getName ().contains (character));
    }

    public static void main(String[] args) {
       EmployeeInfo employeeInfo=new EmployeeInfo ();
       EmployeeDetails EmployeeDetails=new EmployeeDetails ("Mickey",100000);
       EmployeeDetails EmployeeDetails1=new EmployeeDetails ("Timmy",50000);
       EmployeeDetails EmployeeDetails2=new EmployeeDetails ("Annny",40000);
   List<EmployeeDetails> EmployeeDetailsList= Arrays.asList (EmployeeDetails,EmployeeDetails1,EmployeeDetails2);
        System.out.println (sort (EmployeeDetailsList,SortedMethod.BYNAME));
//        System.out.println (sort (EmployeeDetailsList,SortedMethod.BYSALARY));
        System.out.println (employeeInfo.getThirdInCollection (EmployeeDetailsList));
        System.out.println (employeeInfo.isCharacterPresentInAllNames (EmployeeDetailsList,"q"));
    }

}
