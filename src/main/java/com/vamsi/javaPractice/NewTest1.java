package com.vamsi.javaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NewTest1 {
    private Integer id;
    private String name;
    private Float marks;

    public NewTest1(Integer id, String name, Float marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public NewTest1() {
    }

    public static void main(String[] args) {
        NewTest1 newTest1=new NewTest1 (1,"sai",1000f);
        NewTest1 newTest11=new NewTest1 (2,"krishna",2000f);
        List<NewTest1> list= Arrays.asList (newTest1,newTest11);
        list.stream ().collect(Collectors.summingDouble (e->e.marks));

    }
}
