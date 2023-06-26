package com.vamsi.javaPractice.DesignPatterns.StartegyPattern;

public class PaymentCreditCard implements PaymentStrategy{
    private CreditCard creditCard;
    @Override
    public void collectPaymentDetails() {
        creditCard=new CreditCard();

    }

    @Override
    public boolean validatePaymentDetails() {
        return true;
    }

    @Override
    public void pay(int amount) {
        System.out.println("paid using credit card");

    }
}
