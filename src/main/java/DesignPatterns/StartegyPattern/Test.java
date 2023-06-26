package DesignPatterns.StartegyPattern;

public class Test {
    public static void main(String[] args) {
        PaymentService paymentService=new PaymentService();
        paymentService.setPaymentStrategy(new PaymentCreditCard());
        paymentService.processOrder();
    }

}
