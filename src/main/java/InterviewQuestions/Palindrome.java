package InterviewQuestions;

public class Palindrome {
    public static void main(String[] args) {
        String s="madam";
        String result ="";
        char[] chars = s.toCharArray ();
        for(int i=chars.length-1;i>=0;i--){
            result = result + chars[i];
        }
        System.out.println (result);
        if(result.equals (s))
            System.out.println ("true");
    }
}
