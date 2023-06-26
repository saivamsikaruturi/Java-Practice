import java.util.Arrays;

public class Optum {
    public static void main(String[] args) {

        int array[]={4,5,22,6,7,99};
        int first = 0;
        int second=0;
        int third=0;
        first=second=third=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]>first){
                third=second;
                second=first;
                first=array[i];
            }
           else if(array[i]>second){
                third=second;
                second=array[i];
            }
            else if(array[i]>third){
                third=array[i];
            }

        }
        System.out.println (third);
        System.out.println (second);
        System.out.println (first);
        int[]array1={4,3,7,8,6,2,1};

        Arrays.sort (array1);
        for(int i=0;i<array1.length-2;i=i+2){
            int temp=array1[i];
            array1[i]=array1[i+1];
            array1[i+1]=temp;
        }
        System.out.println (Arrays.toString (array1));


        String s="saiVamsi@";
        int count=0;
        String s1="";
        for(int i=0;i<s.length ();i++){
            if( !Character.isLetterOrDigit (s.charAt (i))){
                count++;
            }
            else{
                s1=s1+s.charAt (i);
            }
        }
        System.out.println (count);
        System.out.println (s1);
    //abcd
        //cdab

    }
}
