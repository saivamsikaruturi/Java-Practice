package com.vamsi.javaPractice;

import java.lang.reflect.Field;

public class Reflection {
    public static void main(String[] args) throws ClassNotFoundException {
        Class  employee = Class.forName ("com.vamsi.javaPractice.Employee");
        System.out.println (employee);
        Employee e=new Employee ();
        System.out.println (e.getClass ());
        System.out.println (employee.getModifiers ());
        System.out.println (employee.getSuperclass ());
        Class[] interfaces = employee.getInterfaces ();
        for(Class cl:interfaces){
            System.out.println (cl.getName ());
        }
        Field[] fields = employee.getDeclaredFields ();
        for(Field c:fields){
            System.out.println (c.getName ());
        }


    }
}
