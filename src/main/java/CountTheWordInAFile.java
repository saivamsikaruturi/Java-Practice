import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CountTheWordInAFile {
    public static void main(String[] args) throws IOException {

        int count=0;
        try {
        File file = new File("sample.txt");
        Scanner sc = new Scanner(file);
            int length=0;
            Map<String,Integer>map=new HashMap<> ();
        while(sc.hasNextLine()) {
            String s = sc.nextLine ();
            String[] split = s.split (" ");
            length += split.length;
            count++;
            for (String s1 : split) {
                if (map.get (s1) == null) {
                    map.put (s1, 1);
                } else {
                    map.put (s1, map.get (s1) + 1);
                }
            }
        }
        System.out.println("Total Number of Lines: " + count);
            System.out.println (length);
            System.out.println (map);
        sc.close();
    } catch (Exception e) {
        e.getStackTrace();
    }
         }


}
