package Strings;

public class AllSubStrings {
    public static void main(String[] args) {
        String str="Capgemini";
        for(int i=0;i<str.length ();i++){
            for(int j=i+1;j<str.length ();j++)
                System.out.println (str.substring (i,j));
//        int i;
//        for( i=0;i<=5;i++) {
//            for(int j=i;j<5;j++)
//                System.out.print (" ");
//            for (int k = 1; k < (i * 2); k++)
//                System.out.print ("*");
//            System.out.print ("\n");
//
      }
    }
}
