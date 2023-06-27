package InterviewQuestions;

 public class OddEvenArraySegregating {

     public static void main(String[] args) {

         int[] array = {44, 100, 3, 4, 5, 6};
         seperateEvenOddNumbers (array);
         for(int i = 0; i < array.length; i++) {
             System.out.print(array[i] + " ");
         }
     }




     public static void seperateEvenOddNumbers(int[] arr) {
         if(arr.length <= 1) {
             return;
         }

         int left, right;
         left = 0;
         right = arr.length - 1;

        while(left < right) {
             while(arr[left] % 2 == 0 && left < right) {
                 left++;
             }

             while(arr[right] % 2 != 0 && left < right) {
                 right--;
             }

             if(left < right) {
                 int x = arr[left];
                 arr[left] = arr[right];
                 arr[right] = x;

                 left++;
                 right--;
             }
         }
     }
 }