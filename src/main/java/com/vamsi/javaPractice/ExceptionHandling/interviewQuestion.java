package com.vamsi.javaPractice.ExceptionHandling;

public class interviewQuestion
{
    public static void main(String[] args) {
        System.out.println (method ());
    }
    static int method(){
        try{
            int a=0;
           return 0;
        }
        catch (Exception e){

        }
        finally {
            System.out.println ("finally");
        }
        System.out.println ("hello");
        return 1;
    }
}
