package MultiThreading;


import InterviewQuestions.Employee1;
import InterviewQuestions.EmployeeDatabase;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;


public class SupplyAsyncDemo {

    public List<Employee1> getEmployees() throws ExecutionException, InterruptedException {
        Executor executor = Executors.newCachedThreadPool();
        CompletableFuture<List<Employee1>> listCompletableFuture = CompletableFuture
                .supplyAsync(() -> {
                    System.out.println("Executed by : " + Thread.currentThread().getName());
                    return EmployeeDatabase.fetchEmployees();
                },executor);
        return listCompletableFuture.get();
    }


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        SupplyAsyncDemo supplyAsyncDemo = new SupplyAsyncDemo();
        List<Employee1> employees = supplyAsyncDemo.getEmployees();
        employees.stream().forEach(System.out::println);
    }
}
