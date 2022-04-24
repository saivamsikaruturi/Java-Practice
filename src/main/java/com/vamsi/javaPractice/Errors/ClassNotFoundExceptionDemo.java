package com.vamsi.javaPractice.Errors;

public class ClassNotFoundExceptionDemo {
    public static void main(String[] args) {
        try{
            Class.forName ("com.mysql.jdbc.Driver");
        }
        catch (Exception e){
            e.printStackTrace ();
        }
    }
}
