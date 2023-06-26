import java.util.HashMap;
import java.util.Map;

public class TestPalindrome {
    public static void main(String[] args) {
        int number=123;
        int temp=number;
        int rem=0;
        int result=0;
        while(temp!=0){
            rem=temp%10;
            result=result*10+rem;
            temp=temp/10;
        }
        if(result==number)
            System.out.println ("palindrome");
        else
            System.out.println ("not palindrome");
        String c="preeti";
        char[] chars = c.toCharArray ();
        Map<Character,Integer> map=new HashMap<> ();
        for(Character ch : chars){
            if(map.get(ch)==null){
                map.put(ch,1);
            }
            else{
                map.put(ch,map.get(ch)+1);
            }

        }
        map.entrySet ().stream ().filter (e->e.getValue ()==1).skip (2).limit (1).map (e->e.getKey ()).forEach (System.out::println);
    }

}
