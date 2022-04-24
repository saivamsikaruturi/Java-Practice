package com.vamsi.javaPractice;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;


public class JavaP {

    static Integer getSum(Integer number){
        int rem=0;
        int sum=0;
       for(int i=1;i<=number/2;i++){
           rem=rem%i;
           if(rem==0)
               sum=sum+i;
       }
        return sum;
    }
    public static void main(String[] args) {
        int x = 23;
        int y=43,z;
        z=y;
        y=x;
        x=z;
        System.out.println (x);
        System.out.println (y);

        int a=98,b=100;
        a=a+b;
       b=a-b;
       a=a-b;
        System.out.println(a);
        System.out.println (b);
        Integer sum = getSum (6);
        if(sum==6){
            System.out.println ("perfect");
        }

        int arr[]={1,2,3,4,5,2,3,6};
        LinkedHashSet<Integer> set=new LinkedHashSet<> ();
        for (int i = 0; i < arr.length; i++)
            set.add(arr[i]);
         System.out.println (set);
         int original=371;
         int temp=original;
         int result=0;
         while(temp!=0){
            int rem=temp%10;
            result+=Math.pow (rem,3);
            temp/=10;
         }
         if(result==original){
             System.out.println ("armstrong number");
         }

        int i = anInt (3);
         System.out.println (i);

         String str="madam";
        char[] chars = str.toCharArray ();
        HashMap<Character,Integer> hashMap=new HashMap ();
        for(char ch:chars){
            if(hashMap.get(ch)==null)
                hashMap.put (ch,1);
            else
                hashMap.put(ch,hashMap.get(ch)+1);
        }

         hashMap.entrySet ().stream ().filter (m->m.getValue ()>1).map(f->f.getKey ()).forEach (System.out::println);

        int missNum[]={1,2,4,5};
        int sum1=0;
        for(int k=0;k<=missNum.length-1;k++){
            sum1+=missNum[k];
       }
        int length = missNum.length+1;
        int sum2 =(length*length+length)/2;
        System.out.println (sum2-sum1);
    }
    private static int anInt(Integer input1){
       int output;
       int output1;
       int x=input1/2;
       output=((x+1)* (input1-x+1));
       output1=((input1*input1+input1)+2)/2;

        return output1;
    }



}
