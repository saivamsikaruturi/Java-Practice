package InterviewQuestions;

import java.util.Arrays;

public class ValueLabs {
    public static void main(String[] args) {
        int j=0;
        int array[]={ 0,1,0,1,1,0,1,0,1,1,0};
        for(int i=0;i<array.length-1;i++){
            if(array[i]!=0){
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;
                j=j+1;
            }

        }
        System.out.println (Arrays.toString (array));


    }




}
