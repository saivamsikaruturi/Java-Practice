import java.util.Arrays;
import java.util.List;

public class ClosestNumbers {

    public static void closestNumbers(List<Integer> numbers){
        int diff=0;

        for(int i=0;i<numbers.size ()-1;i++){
         int  diff1= numbers.get (i) -numbers.get(i+1);
           if(diff1<diff)
            System.out.println (numbers.get(i) +" "+numbers.get(i+1));
        }

    }

    public static void main(String[] args) {
        List<Integer>list= Arrays.asList (6,2,4,10);
        ClosestNumbers.closestNumbers (list);
    }
}
