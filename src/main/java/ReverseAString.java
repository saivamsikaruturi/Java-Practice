import java.util.ArrayList;
import java.util.List;

public class ReverseAString {
    public static void main(String[] args) {
        String str = "Hello World";
        char[] ch =str.toCharArray ();
        String reversedStr="";
        int i=0,j=str.length ()-1;
       for( i=0;i<str.length ()/2;i++){
           char temp=ch[j];
           ch[j] =ch[i];
           ch[i]=temp;
           j--;


        }
       reversedStr=new String (ch);
        System.out.println (reversedStr);
      final List<String> list=new ArrayList<> ();
      list.add("one");
      list.add("two");
      list.stream ().forEach (System.out::println);

        final List<String> list1=new ArrayList<> ();
      list1.add("two");
      list1.add("three");
        boolean b = list.stream ().anyMatch (match -> list1.contains (match));
        System.out.println (b);

    }
}
