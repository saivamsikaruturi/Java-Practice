package InterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class Cg {
    public Cg(int age, String name, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    private int age;
  private String name;
  private int salary;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cg{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Cg cg1=new Cg(23,"sai",30000);
        Cg cg2=new Cg(27,"krishna",500000);
        Cg cg3 =new Cg(35,"Rashmi",1000000);
        List<Cg> cg= Arrays.asList (cg1,cg2,cg3);
        cg.stream ().filter (e->e.getAge ()>25).map (e->e.getSalary ()+(e.getSalary ()*0.1)).forEach (System.out::println);
    }
}
