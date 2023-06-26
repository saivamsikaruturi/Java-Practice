package com.vamsi.javaPractice;

import java.util.List;

public class Department {
    private Integer id;
    private String name;
    private List<String> labs;

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", labs=" + labs +
                '}';
    }

    public Department(Integer id, String name, List<String> labs) {
        this.id = id;
        this.name = name;
        this.labs = labs;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLabs(List<String> labs) {
        this.labs = labs;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getLabs() {
        return labs;
    }
}
