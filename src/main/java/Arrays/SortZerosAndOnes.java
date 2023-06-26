package Arrays;

import java.util.Arrays;

public class SortZerosAndOnes {
    public static void main(String[] args) {
        int[] array = {0, 1, 0, 0, 1, 0, 1, 0, 0, 1};
       int  left=0,right=array.length-1;
       while(left<right) {
           while (array[left]  == 0 ) {
               left++;
               System.out.println (left);
           }
           while (array[right]  == 1) {
               right--;
               System.out.println (right);
           }
           if (left < right) {
               int x = array[left];
               array[left] = array[right];
               array[right] = x;
           }
       }
        System.out.println (Arrays.toString (array));
    }
}
