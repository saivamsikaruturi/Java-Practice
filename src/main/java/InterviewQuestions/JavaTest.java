package InterviewQuestions;

public class JavaTest {

    public static char[] sortString(String java){
        char[] chars = java.toCharArray ();
        if(java.matches ("[a-zA-Z]")){
            for(int i=0;i<java.length ();i++){
                for(int j=i;i<java.length ();j++){
                    if(chars[i]>chars[j])
                        chars[i]=chars[j];
                   return chars;
                }
            }
        }

        return chars;
    }
    public static void main(String[] args) {
        String java="Java";
        System.out.println (sortString (java));
    }

}
