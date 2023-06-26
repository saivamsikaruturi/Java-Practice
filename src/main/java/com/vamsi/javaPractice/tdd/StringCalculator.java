package com.vamsi.javaPractice.tdd;

import java.util.Arrays;

public class StringCalculator extends  Exception{
    public int addNumbers(String numbers){
        int result=0;
        if(numbers.equals ("")) {
             result=0;
        }
        else if(numbers.contains ("//")){
            String[] split = numbers.split ("\n");
            String[] split1 = split[1].split (";");
            for(int i=0;i<split1.length;i++){
                result+=Integer.parseInt (split1[i]);
            }
        }
        else{
            String[] splitArray = numbers.replace ("\n",",").split (",");
            for(int i=0;i<splitArray.length;i++) {
                result += Integer.parseInt (splitArray[i]);
            }
        }
        return result;
    }
}
