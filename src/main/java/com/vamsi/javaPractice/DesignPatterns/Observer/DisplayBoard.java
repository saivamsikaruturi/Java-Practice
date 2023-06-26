package com.vamsi.javaPractice.DesignPatterns.Observer;

public class DisplayBoard implements Observer{
    @Override
    public void update(Stock stock) {
        System.out.println("DisplayBoard - The price of  "+stock.getName()+" "+ stock.getPrice());
    }
}
