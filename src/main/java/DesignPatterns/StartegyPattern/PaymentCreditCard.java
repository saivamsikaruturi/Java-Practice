package DesignPatterns.StartegyPattern;

import com.vamsi.javaPractice.DesignPatterns.StartegyPattern.CreditCard;
import com.vamsi.javaPractice.DesignPatterns.StartegyPattern.PaymentStrategy;

public class PaymentCreditCard implements PaymentStrategy {
    private com.vamsi.javaPractice.DesignPatterns.StartegyPattern.CreditCard creditCard;
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
