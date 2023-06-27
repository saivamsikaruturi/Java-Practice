package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RotateAnArray {
    public static void main(String[] args) {
      int  inputValue =26;
      int[] inputArray={1,2,3,4};
        for(int i=0;i<inputValue;i++){
                int first=inputArray[0];
                int k;
                for( k=0;k<inputArray.length-1;k++){
                    inputArray[k]=inputArray[k+1];
                }
                inputArray[k]=first;

        }
        System.out.println (Arrays.toString (inputArray));
        List<Persons> personList=new ArrayList ();
        Persons p=new Persons("anil","kumar");
        Persons p1=new Persons ("anil","das");
        Persons p2=new Persons("vamsi","krishna");
        Persons p4=new Persons("vamsi","varnasi");
        personList.add (p1);
        personList.add(p);
        personList.add(p2);
        personList.add(p4);

        personList.stream().collect(Collectors.groupingBy (Persons::getFirstName)).entrySet ().forEach (System.out::println);
    }
}
