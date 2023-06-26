import java.util.Arrays;
import java.util.List;

public class PalindromeString {
    public static void main(String[] args) {
//        String s="nitin";
//        String result="";
//        for(int i=s.length ()-1;i>=0;i--){
//            result+=s.charAt (i);
//        }
//        if(result.equals (s)){
//            System.out.println ("palindrome");
//        }
//        else{
//            System.out.println ("not a palindrome");
//        }
      int[] array={1,2,3,4,5,6,7,8,9,10};
//        Arrays.stream (array).filter (e->e%2==0).map(e->e*e).forEach(System.out::println);
//        Arrays.stream (array).filter (e->e%2!=0).map(e->e*e*e).forEach(System.out::println);
        Arrays.stream (array).map(e->{
            if(e%2==0){
                e=e*e;
            }
            else{
                e=e*e*e;
            }
            return e;
        }).forEach (System.out::println);
        Arrays.stream (array).map(e->e*e).sum ();
        List<String>list=Arrays.asList ("vamsi","krishna",null,"vamsi","");
        list.stream ().distinct ().filter (e->e!=null).forEach (System.out::println);
    }
}
