package com.vamsi.javaPractice.StreamApiTesting;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList (1, 2, 3, 4, 5, 6);
        Map<Integer, Integer> collect = integers.stream ().collect (Collectors.toMap (Integer::intValue, Integer::intValue));
        System.out.println (collect);

    }
}
