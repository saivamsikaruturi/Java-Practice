package com.vamsi.javaPractice.ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Exceptions {
    public static void main(String[] args) throws IOException {

        /*try with resources*/

        try (BufferedReader br1 = new BufferedReader (new FileReader ("C:\\Users\\karukris\\Documents\\BLD API GATEWAY DETAILS.txt"))) {
            System.out.println ("Try with resources");
        }

        /* multiple catch blocks*/

     //   BufferedReader br = null;
//        try {
//        //    br = new BufferedReader (new FileReader ("C:\\Users\\karukris\\Documents\\BLD API GATEWAY DETAILS.txt"));
//            System.out.println (10/0);
//            throw new ArithmeticException ();
//        }
//
//
//
//        catch(Exception e1234){
//
//         e1234.printStackTrace ();
//         e1234.toString ();
//         e1234.getMessage ();
//        }
//        finally {

  //      }

        /*Pipe Symbol (Handling Multiple Exception)*/

        try{
            System.out.println ("try block");
            System.out.println (10/0);
        }
        catch (ArithmeticException  | NullPointerException e12345){
            System.out.println ("using pipe in catch block");

        }

        String name="sai";
            String name1="vamsi";
        System.out.println (name.concat (name1));


        StringBuilder builder=new StringBuilder ("sai");
        builder.append ("vamsi");
        System.out.println (builder);

       Optional<List<Integer>> distinctPartKitIds = Optional.of (Arrays.asList (1,2,3));
      distinctPartKitIds.ifPresentOrElse (id->System.out.println ("ok"),()->System.out.println ("not"));
      distinctPartKitIds.ifPresent ((id -> System.out.println ("yes")));
      if(!distinctPartKitIds.isEmpty ()){
          System.out.println ("not empty");
      }
    }
}
