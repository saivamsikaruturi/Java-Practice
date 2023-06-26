package com.vamsi.javaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    static int j=getDetails ();
    public static void main(String[] args) {
       int array[]={3,2,3,4,5,6};
      int target=6;
        HashMap<Integer,Integer> hashMap=new HashMap<> ();
        for(int i=0;i<array.length;i++){
            if(hashMap.containsKey (target-array[i])) {
                int i1 = target - array[i];
                System.out.println (i + ", " + hashMap.get (i1));
                break;
            }
            hashMap.put(array[i],i);

        }



    }
    public static int getDetails(){
        System.out.println ("hello");
        return 1;
    }
}
