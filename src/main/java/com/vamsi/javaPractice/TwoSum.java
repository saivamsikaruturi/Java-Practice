package com.vamsi.javaPractice;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
       int array[]={1,2,3,4,5,6};
      int target=9;
//       for(int i=0;i<array.length;i++){
//           for(int j=i+1;j<array.length;j++){
//               if(array[i]+array[j]==target)
//                   System.out.println (array[i]+" , "+array[j]);
//               break;
//           }
//       }
        HashMap<Integer,Integer> hashMap=new HashMap<> ();
        for(int i=0;i<array.length;i++){
            hashMap.put(array[i],1);
        }
        for(int i=0;i<array.length;i++){
            int secondNumber=target-array[i];
            if(hashMap.containsKey (secondNumber))
                System.out.println (array[i]+", "+secondNumber);

        }



    }
}
