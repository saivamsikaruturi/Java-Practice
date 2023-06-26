import java.util.Arrays;
import java.util.List;

public class Siemens {
    public static void main(String[] args) {
        String s="v a   msi krishna ";
        String reverse="";
        String trim = s.trim ();
        String s1 = s.replaceAll("\\s","");
        System.out.println (s1);
        System.out.println (trim);
        for(int i=s.length ()-1;i>=0;i--){
           reverse+=s.charAt (i);
        }
        System.out.println (reverse);
        List<Integer> list= Arrays.asList (1,2);

                }
}
