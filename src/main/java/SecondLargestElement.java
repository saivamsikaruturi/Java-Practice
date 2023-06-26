public class SecondLargestElement {
    public static void main(String[] args) {
        int[] array={10,6,20,5,4,50,100,80};
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i< array.length;i++){
            if(array[i]>first)
            {
                second=first;
                first=array[i];
            }
            if(array[i]<first && array[i]>second){
                second=array[i];
            }

        }
        System.out.println (second);
    }
}
