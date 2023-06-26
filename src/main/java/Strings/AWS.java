package Strings;

public class AWS {
    public static void main(String[] args) {
        String s="AWSGAWS";
        System.out.println (replaceSubString(s));
    }

    private static String replaceSubString(String awsawsg) {
        String[] aws2 = awsawsg.split ("AWS");
        String s1="";
        StringBuffer buffer = new StringBuffer ();
        for (String s : aws2) {
            if (!s.equals ("AWS")) {
                buffer.append (s);
                if (buffer.length () >= 1) {
                  s1= buffer.toString ();
                } else {
                   s1= "null";
                }
            }


        }
     return  s1;
    }
}
