package InterviewQuestions;

public class RotateAString {

    public static boolean checkIfARotatedString(String str, String rotatedString){
        String c=str.concat (str);
        if(c.contains (rotatedString))
            return true;
        else
            return false;

    }
    public static String rotateAString(String str ,Integer r){
       return str.substring (r).concat (str.substring (0,r));

    }
    public static void main(String[] args) {
        System.out.println (RotateAString.checkIfARotatedString ("decode","codede"));
        System.out.println (RotateAString.rotateAString ("decode",2));
    }
}
