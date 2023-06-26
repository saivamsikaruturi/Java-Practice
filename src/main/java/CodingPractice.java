public class CodingPractice {
    public static void main(String[] args) {
        //replace special characters from string
        String s="j%a#vm&12$";
        String s1 = s.replaceAll ("[^0-9A-Za-z]", "");
        System.out.println (s1);

        //check if the character is alphabet or not
        String s2="j2EE";
        char[] chars = s2.toCharArray ();
        String s3="";
        for(Character ch :chars){
            int ch1=ch;
            System.out.println (ch1);
            if((ch1>=97 && ch1<=122) || (ch1>=65 && ch1<=90)){
                System.out.println ("yes"+ch);
                s3+=String.valueOf (ch);
            }
            else{
                System.out.println ("no"+ch);
            }

        }
        System.out.println (s3);
        String word="helloaz";
        char[] chars1 = word.toCharArray ();
        String string="";
        for(Character c :chars1) {
            System.out.println (c-'a'+1);
            System.out.println ("value"+(((c - 'a' -2))));
            if((((c - 'a' -2)%26 ))>0) {
                string += Character.toString ((char) (((c - 'a' -2) %26) + 'a'));
            }
            else{
                System.out.println ("ll");
              string+=  Character.toString ((char)(((c - 'a' -2)%26 )+'a'+26));
            }
        }
        System.out.println (string);
    }
}
