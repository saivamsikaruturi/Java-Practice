package com.vamsi.javaPractice;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayDuplicates {
    public static void main(String[] args) {
        Integer a[] = {5,6,2,3,7,9,5,6,7};
        HashMap<Integer,Integer>map1=new HashMap<> ();
        for(int i=0;i<a.length;i++){
            if(map1.get (a[i])==null){
                map1.put (a[i], 1);
            }
        else{
                map1.put (a[i], map1.get (a[i]) + 1);
                        }
        }
      map1.entrySet().stream().filter(d->d.getValue ()>1).forEach(System.out::println);
        map1.entrySet ().stream ().map (e -> e.getValue ()).count ();

    }


}
