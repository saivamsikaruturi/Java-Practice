package com.vamsi.javaPractice.DesignPatterns.StartegyPattern;

public interface PaymentStrategy {

    void collectPaymentDetails();
    boolean validatePaymentDetails();
    void pay(int amount);
}
