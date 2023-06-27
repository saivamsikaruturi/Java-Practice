package InterviewQuestions;

import java.util.Arrays;

public class ModiVcare {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6};
        int findElement = 100;
        int low = 0;
        int high = array.length;
        int[] array1={3,100,78,22};
        int a=-1;
        for(int i=0;i<array1.length;i++){

            if(array1[i]==11) {
                a=i;
            }

        }
        if(a==-1){
            int res=array1[0];
            for(int i=0;i<array1.length;i++){
                if (Math.abs(120- res) >
                        Math.abs(120 - array1[i]))
                {
                    System.out.println ("Math.abs(11- res)"+Math.abs(70- res));

                    System.out.println (Math.abs(70- array1[i]));res = array1[i];
                }
            }
            System.out.println ("res"+res);
        }
        System.out.println (searchElement (array,low,high,findElement));
        System.out.println (secondLargest(array));


    }

    private static int secondLargest(int[] array) {
        int f=0;int s=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>f){
                s=f;
                f=array[i];
            }
            else if(array[i]>s){
                s=array[i];
            }
        }
        return s;
    }

    private static int searchElement(int[] array,int low,int high,int findElement) {

        if (high > low) {
            int mid = (low + high) / 2;
            if (findElement == array[mid]) {
                return mid;
            } else {
                if(findElement>array[mid]){
                    searchElement (array,mid+1,high,findElement);
                }
                else{
                    searchElement (array,0,mid-1,findElement);
                }

            }
        }
       return -1;
    }
}
