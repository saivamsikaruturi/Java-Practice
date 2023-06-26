import java.time.LocalDate;
import java.util.Stack;

public class BalancedString {
    public static void main(String[] args) {
        String s="[]{)}";
        Stack<Character>st=new Stack<> ();
        for(int i=0;i<s.length ();i++){
            if(s.charAt (i)=='{'|| s.charAt (i)=='('||s.charAt (i)=='['){
                st.push (s.charAt (i));
            }
            else if(!st.isEmpty ()&&((s.charAt (i)=='}'&& st.peek ()=='{')
            ||(s.charAt (i)==']'&& st.peek ()=='[')
            ||(s.charAt (i)==')'&& st.peek ()=='('))){
              st.pop ();
            }
            else{
                st.push(s.charAt (i));
            }
        }
        if(st.isEmpty ())
            System.out.println ("balanced");
        else
            System.out.println ("not balanced");
        LocalDate endDate=null;
        System.out.println (endDate != null && endDate.isBefore(LocalDate.now ()) ? endDate :LocalDate.now ());
    }
}
