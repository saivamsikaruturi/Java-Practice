import java.util.Arrays;

public class TestArrayList {
    public static void main(String[] args) {
       int[] input={2,3,2,5,3,6,0,2,6,2};
       //->{2,2,5,6,0,2,6,2,3,3};
      int  inputValue=3;
       int[]output=new int[input.length];
       int count=0;
       int count1=0;
       for(int i=0;i<input.length;i++){
             if(input[i]!=inputValue) {
                 output[count++] = input[i];
             }
             else{
                 count1++;
             }
       }
       for(int j=0;j<input.length;j++) {
           for (int i = 0; i < output.length; i++) {
               if (output[i] == 0 && input[j] != 0) {
                   System.out.println (input[j]);
                   output[i] = 3;
               }
           }
       }
        System.out.println (Arrays.toString (output));
    }
}
