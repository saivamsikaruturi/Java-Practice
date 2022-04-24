package com.vamsi.javaPractice.MultiThreading;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vamsi.javaPractice.Employee1;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;


public class RunAsyncDemo {
    public Void saveEmployees(File jsonFile) throws ExecutionException, InterruptedException {
        ObjectMapper mapper = new ObjectMapper ();
        CompletableFuture<Void> runAsyncFuture = CompletableFuture.runAsync(new Runnable() {

            @Override
            public void run() {
                try {
                    List<Employee1> employee= mapper
                            .readValue(jsonFile, new TypeReference<List<Employee1>> () {
                            });
                    //write logic t save list of employee to database
                    //repository.saveAll(employees);
                    System.out.println("Thread : " + Thread.currentThread().getName());
                    System.out.println(employee.size());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        return runAsyncFuture.get();
    }


    public Void saveEmployeesWithCustomExecutor(File jsonFile) throws ExecutionException, InterruptedException {

        ObjectMapper mapper = new ObjectMapper();
        Executor executor = Executors.newFixedThreadPool(5);
        CompletableFuture<Void> runAsyncFuture = CompletableFuture.runAsync(
                () -> {
                    try {
                        List<Employee1> employees = mapper
                                .readValue(jsonFile, new TypeReference<List<Employee1>> () {
                                });
                        //write logic t save list of employee to database
                        //repository.saveAll(employees);
                        System.out.println("Thread : " + Thread.currentThread().getName());
                        System.out.println(employees.size());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                },executor);

        return runAsyncFuture.get();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        RunAsyncDemo runAsyncDemo = new RunAsyncDemo();
        runAsyncDemo.saveEmployees(new File ("C:\\Users\\karukris\\3D Objects\\untitled\\target\\employee.json"));
        runAsyncDemo.saveEmployeesWithCustomExecutor(new File("C:\\Users\\karukris\\3D Objects\\untitled\\target\\employee.json"));

    }
}
