package com.vamsi.javaPractice;

import java.util.*;
import java.util.stream.Collectors;

public class FrequencyArray {
    public static void main(String[] args) {
       List<String> list = Arrays.asList ("JAVA", "J2EE", "JSP", "SERVLETS", "JAVA", "STRUTS", "JSP");
        Set<String> collect1 = list.stream ().collect (Collectors.toSet ());
        System.out.println (collect1);
    }
}
