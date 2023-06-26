package Arrays;

public class SecondHighestElementFromAnArray {
    public static void main(String[] args) {
        System.out.println (getSecondHighestElement (new int[]{9,2,1,67,47}));
    }
    public static int getSecondHighestElement(int[] array){
        int largest=0,secondLargest=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>largest)
            {
                secondLargest=largest;
                largest=array[i];

            }
            else if(array[i]>secondLargest)
                secondLargest=array[i];
        }
        return  secondLargest;
    }
}
