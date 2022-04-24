package com.vamsi.javaPractice;

import java.time.LocalDate;


public class Employee implements  Cloneable{

    private Integer empId;
    private String empName;
    private Integer empAge;
    private String empGender;
    private String empDept;
    private LocalDate doj;
    private Integer salary;

    public Employee(Integer empId, String empName, Integer empAge, String empGender, String empDept, LocalDate doj, Integer salary) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.empGender = empGender;
        this.empDept = empDept;
        this.doj = doj;
        this.salary = salary;
    }

    public Integer getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public Integer getEmpAge() {
        return empAge;
    }

    public String getEmpGender() {
        return empGender;
    }

    public String getEmpDept() {
        return empDept;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public Integer getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empAge=" + empAge +
                ", empGender='" + empGender + '\'' +
                ", empDept='" + empDept + '\'' +
                ", doj='" + doj + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Employee e=(Employee) o;
        if(this.empId==e.empId && this.empName==e.empName)
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return getEmpId ();
    }
    public static void main(String[] args) throws CloneNotSupportedException {

        Employee emp1= new Employee (1,"Sai",23,"Male","NA AS CSD", LocalDate.now (),35000);
      System.out.println (emp1);
        Employee clone = (Employee) emp1.clone ();
        System.out.println ("****************");
        System.out.println (clone.getEmpName ());
    }
}
