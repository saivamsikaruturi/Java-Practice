package InterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DSP {
    public static void main(String[] args) {
     Map<Integer, List<String>> map=new HashMap<> ();
      map.put(1,List.of("Biology","Maths"));
      map.put(2,List.of("Chemistry","Maths"));
      map.put(3,List.of("English","Social"));
      map.entrySet ().stream ().forEach (System.out::println);
        String a = "null";
        System.out.println("null".equalsIgnoreCase(a));

        System.out.println (validatePassword ("AasdAa1@"));

        List<Integer> equipmentIdMve = List.of(4747);
        List<Integer> equipmentIdMvs =List.of(4747,831);
        List<Integer> diffEquipment = equipmentIdMve.stream()
                .filter(i -> !equipmentIdMvs.contains(i))
                .collect(Collectors.toList());
        System.out.println (diffEquipment);
        System.out.println (Arrays.toString (sortCharArray (new char[]{'d','c','b','a','f','e'})));
        String s="java";
        Arrays.stream (s.split ("")).collect(Collectors.groupingBy (Function.identity (),Collectors.counting ())).entrySet ().stream ().filter (e->e.getValue ()>1).forEach (System.out::println);
    }
  static boolean validatePassword(String password){
        if(password.length ()>=8 && password.matches ("[A-Za-z0-9@%^&/]"))
      return true;
        else
            return  false;
    }
    static char[] sortCharArray(char[] array){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                int a=array[i];
                int b=array[j];
            if(a<b){
                char temp= array[i];
                array[i]=array[j];
                array[j]=temp;
                }
        }
        }
        return array;
    }
}
