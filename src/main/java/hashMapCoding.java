import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class hashMapCoding {
    public static void main(String[] args) {
        String a="abcdbacd";
        Map<Character,Integer> map=new HashMap<> ();
        for(int i=0;i<a.length ();i++){
            if(map.get(a.charAt (i))==null){
                map.put(a.charAt (i),1);
            }
            else{
                map.put (a.charAt (i),map.get(a.charAt (i))+1);
            }

        }
        map.entrySet ().stream ().forEach (System.out::println);
        int[] array={5,8,7,6,4};
        int temp=0;
        for(int i=0;i<array.length-1;i++){

             if(array[i]>array[i+1]){
                 System.out.println (array[i]);
                 temp=array[i];
                 array[i]=array[i+1];
                 array[i+1]=temp;
                 i=-1;
             }
        }
        System.out.println (Arrays.toString (array));
    }


}
