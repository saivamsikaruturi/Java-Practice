import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class abcdefg {

    /*
     * Complete the 'superReducedString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static void  superReducedString(String s) {

        boolean found = false;
        for (int i = 0; i < s.length () - 1; i++) {
            String a = s.substring (i, i + 1);
            String b = s.substring (i + 1, i + 2);
            if (a.equals (b)) {
                s = s.substring (0, i) + s.substring (i + 2, s.length ());

                superReducedString (s);
                found = true;
                break;
            }
        }
        if (!found) {
            if (s.isEmpty ()) {
                System.out.println ("Empty String");
            } else {
                System.out.println (s);
            }
        }

    }



    public static void main(String[] args) {
        abcdefg.superReducedString ("aabbcd");
    }
}