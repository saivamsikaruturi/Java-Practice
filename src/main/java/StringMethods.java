import com.vamsi.javaPractice.StringPlay;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StringMethods {
    
  public static String  getUnique(StringPlay s1, String s){
    HashMap<Character,Integer> map1=new HashMap<> ();
    char[] chars = s.toCharArray ();
    for(int i=0;i<s.length();i++){
      if(map1.get (chars[i])==null){
        map1.put (chars[i], 1);
      }
      else{
        map1.put (chars[i], map1.get (chars[i]) + 1);
      }
    }
    List<Character> collect = map1.entrySet ().stream ().filter (d -> d.getValue () == 1).map (e -> e.getKey ()).collect (Collectors.toList ());
    StringBuilder sb = new StringBuilder();
    for (Character s2 : collect)
    {
      sb.append(s2);
      sb.append("\t");
    }

    return sb.toString ();
  }
  public static String  getDuplicate(StringPlay s1, String s){
    HashMap<Character,Integer> map1=new HashMap<> ();
    char[] chars = s.toCharArray ();
    for(int i=0;i<s.length();i++){
      if(map1.get (chars[i])==null){
        map1.put (chars[i], 1);
      }
      else{
        map1.put (chars[i], map1.get (chars[i]) + 1);
      }
    }
    List<Character> collect = map1.entrySet ().stream ().filter (d -> d.getValue () > 1).map (e -> e.getKey ()).collect (Collectors.toList ());
    StringBuilder sb = new StringBuilder();
    for (Character s2 : collect)
    {
      sb.append(s2);
      sb.append("\t");
    }

    return sb.toString ();
  }
}
