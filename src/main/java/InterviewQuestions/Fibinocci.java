package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Fibinocci {


    private static Integer AtomicInteger=-401;

    public static void main(String[] args) {
//        int n=0;
//        int n1=1;
//        int result=0;
//        for(int i=0;i<10;i++){
//            result=n+n1;
//            System.out.println (result);
//            n=n1;
//            n1=result;
//        }
        //reverse a string

        int[] array={2,2,4,4,4,3,8,9,9};
        Map<Integer,Integer> map=new HashMap<> ();
        AtomicInteger result1= new AtomicInteger ();
        AtomicInteger result2= new AtomicInteger ();
        result2.getAndAdd (-401);
        for(int i=0;i<array.length;i++){
            if(map.get (array[i])==null){
                map.put(array[i],1);
            }
            else{
                map.put(array[i],map.get(array[i])+1);
            }
        }
        int finalResult = result1.intValue ();
        AtomicInteger finalResult1 = new AtomicInteger (finalResult);
        map.entrySet ().forEach (e->{
            if(e.getKey ()<1){
                System.out.println (e.getKey ()+"-"+e.getValue ());
                finalResult1.getAndAdd (5 - e.getValue ());
            }
        });
        if(finalResult1.intValue ()>0) {
            result1 = finalResult1;
        }
        else {
            result1 = result2;
        }
        System.out.println (result1);
    try{
        throw  new Exception ();
    }
    catch (Exception e){
        try{
            int i=5/0;
        }
        catch(ArithmeticException e1){
            System.out.println ("arithmetic");
        }

    }
        System.out.println ("caught");
    String s1="hello";
    String s2=new String("hello");
    String s3=s2.intern ();
        System.out.println (s1==s2);
        System.out.println (s1==s3);
//        int[]a= {1,2,3);
//        System.out.println (a[3])}];

    }
}
