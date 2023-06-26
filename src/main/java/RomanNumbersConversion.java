import java.util.HashMap;
import java.util.Map;

public class RomanNumbersConversion {
    public static void main(String[] args) {
        String romanNumber="XL";
        int result=0;
        Map<Character,Integer> map=new HashMap<> ();
        map.put('C',100);
        map.put('D',500);
        map.put('I',1);
        map.put('V',5);
        map.put('M',1000);
        map.put('L',50);
        map.put('X',10);
        for(int i=0;i< romanNumber.length();i++){


            if(i>0 && map.get (romanNumber.charAt (i))>map.get (romanNumber.charAt (i-1))){
                 System.out.println (map.get(romanNumber.charAt (i-1)));
                System.out.println (map.get(romanNumber.charAt (i)));
                result+=map.get(romanNumber.charAt (i))-2*map.get(romanNumber.charAt (i-1));
            }
            else{
                result+=map.get(romanNumber.charAt (i));
            }

        }
        System.out.println (result);
    }
}
