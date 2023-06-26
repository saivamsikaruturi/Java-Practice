import java.util.Arrays;

public class LTI {
    public static void main(String[] args) {
       //reverse a String using recurrsion
        String s="krishna";
        System.out.println (reverseString (s));
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print ("*");
            }
            System.out.println ();
        }
        System.out.println ("----------------");
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print ("*");
            }
            System.out.println ();
        }
        System.out.println ("-----------------");
        int[]array={1,5,2};
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]>first){
               second=first;
               first=array[i];
            }
            if(array[i]<first && array[i]>second ){
                second=array[i];
            }

        }
        System.out.println (second);
        System.out.println ("----------------");
        int min=array[0];
        int max=array[0];
        for(int i=0;i<array.length;i++){

            if(array[i]>max){
                max=array[i];
            }
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println ("min"+min);
        System.out.println ("max"+max);

        String s1="nitin";
        for(int i=0;i<s1.length ();i++){
            for(int j=i+1;j<s1.length ();j++) {
                String substring = s1.substring (i, j);
                if (isPalindrome (substring) == true) {
                    System.out.println (substring);
                }
            }
        }
    }

    private static boolean isPalindrome(String substring) {
        int i=0;
        int j=substring.length ()-1;
       while(i<=j){
           if(substring.charAt (i)!=substring.charAt (j)) {
               return false;
           }
           else
               i++;
           j--;
       }
       return true;
    }

    public static String reverseString(String str)
    {
        if (str.length ()==1)
            return str;
        return reverseString(str.substring(1)) + str.charAt(0);
    }


}


