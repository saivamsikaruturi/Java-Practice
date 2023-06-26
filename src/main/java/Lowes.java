import java.util.HashMap;
import java.util.Map;


public class Lowes {
    public static void main(String[] args) {
        String s="KaruturiSaiNagaVamsiKrishna";
        char[] chars = s.toCharArray ();
        Map<Character,Integer> map=new HashMap<> ();
        for(Character ch :chars){
            if(map.get(ch)==null){
                map.put(ch,1);
            }
            else{
                map.put(ch,map.get(ch)+1);
            }
        }
        map.entrySet ().stream ().forEach (System.out::println);

        //palindrome
        String reverse="";
        for(int i=s.length ()-1;i>=0;i--){
            reverse+=s.charAt (i);
        }
        if(reverse.equals (s)){
            System.out.println ("palindrome");
        }
        else{
            System.out.println ("not a palindrome");
        }
    }
}
