package DesignPatterns.StartegyPattern;

import com.vamsi.javaPractice.DesignPatterns.StartegyPattern.PaymentCreditCard;
import com.vamsi.javaPractice.DesignPatterns.StartegyPattern.PaymentService;

public class Test {
    public static void main(String[] args) {
        PaymentService paymentService=new PaymentService();
        paymentService.setPaymentStrategy(new PaymentCreditCard());
        paymentService.processOrder();
    }

}
