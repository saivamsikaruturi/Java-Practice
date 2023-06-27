package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class AllState {
    public static void main(String[] args) {
        String name="Shravan";
        String[] split = name.split ("");
        Map<String,Integer> map=new HashMap<> ();
        for(String element :split){
            if(map.get(element)==null){
                map.put(element,1);
            }
            else{
                map.put(element,map.get(element)+1);
            }
        }
        map.entrySet ().forEach (System.out::println);

        //{}
        String s="{(}";
        Stack<Character> stack = new Stack<> ();
        for(int i=0;i<s.length ();i++){
            if(s.charAt (i)=='{' || s.charAt (i)=='(' || s.charAt (i)=='['){
                stack.push (s.charAt (i));
                
            }
            else if(s.charAt (i)=='}' || s.charAt (i)==']'|| s.charAt (i)==')'){
                stack.pop ();
            }
        }
        if(stack.isEmpty ()){
            System.out.println ("balanced string");
        }
        else{
            System.out.println ("not a balanced string");
        }
    }
}
