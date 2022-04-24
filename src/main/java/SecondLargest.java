import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargest {
    public static void main(String[] args) {
        int[]array={44,66,22,55};
//        List<Integer>list= Arrays.asList (44,55,22,66,77);
//        Integer integer = list.stream ().sorted (Comparator.reverseOrder ()).collect (Collectors.toList ()).get (1);
//        System.out.println (integer);
        int temp;
        temp=array[0];
        array[0]=array[1];
        array[1]=temp;
        int temp1;
        temp1=array[2];
        array[2]=array[3];
        array[3]=temp1;

        System.out.println (array[0]);
        System.out.println (array[1]);
        System.out.println (array[2]);
        System.out.println (array[3]);
    }
}
