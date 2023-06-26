package com.vamsi.javaPractice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MissingNumberInAnArray {
    public static void main(String[] args) {
//        int array[]={1,2,3,4,5,7,8,9,10};
//        int sum=0;
//        for(int i=0;i<array.length;i++){
//            sum+=array[i];
//        }
//        int actuallength=array.length+1;
//
//        int result=(actuallength*(actuallength+1)/2);
//
//        int missingNumber = result-sum;
//        System.out.println (missingNumber);
//        int sum = 0;
//        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        for (int i = 0; i < 3; i++) {
//
//            for (int j = 0; j < 3; j++) {
//                if (i == 0 && j == 2 || i == 1 && j == 1 || i == 2 && j == 0)
//
//                    sum = sum + a[i][j];
//            }
//        }
//        System.out.println (sum);
//        List<Integer>names=Arrays.asList (7,69,2,221,8974);
//        Integer[] strings = names.stream ().toArray (Integer[]::new);
//        Arrays.sort(strings);
//        int min=0,max=0;
//        for(int i=1;i<strings.length;i++)
//            max+=strings[i];
//        for(int i=0;i<(strings.length-1);i++)
//            min+=strings[i];
//        System.out.println(min+" "+max);
        System.out.println("Hello, World!");
        List<BigDecimal>manualCosts=Arrays.asList (BigDecimal.valueOf (1221),BigDecimal.valueOf (0E-10));
        long count = manualCosts.stream()
                .filter(costs -> costs != null && costs.compareTo(BigDecimal.ZERO) == 0)
                .count();
        System.out.println("count" + manualCosts.stream()
                .filter(costs -> costs != null && costs.compareTo(BigDecimal.ZERO) >0).collect (Collectors.toList ()));

    }
}
