package com.vamsi.javaPractice.Strings;

public class Source {

    public static String concat(String str1, String str2){
        String trim = str1.trim ();
        String trim1 = str2.trim ();
        String concat = trim.concat (trim1);
        return concat;
    }

    public Integer getIndex(String str, char ch){
        int i = str.indexOf (ch);
        return i;
    }

    public String padRight(String str, int len){
        String padded = String.format("%"+(len-str.length ())+"s", "").replace(' ', ',');
        return  str+padded;
    }

    public static void main(String[] args) {
        System.out.println (concat ("Cat ","Dog"));
        Source source=new Source ();
        System.out.println (source.getIndex ("cat",'a'));
        System.out.println (source.padRight ("cat",5));
    }
}
