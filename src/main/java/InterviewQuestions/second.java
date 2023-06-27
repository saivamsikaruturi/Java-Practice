package InterviewQuestions;

public class second {
    public int get2ndSmallestNumber(int[] arr) {

        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }


        }
        return arr[arr.length-2];


    }

    public static void main(String[] args) {
    second second=new second ();
        System.out.println (second.get2ndSmallestNumber (new int[]{4,1,5,4,0}));
    }
}
