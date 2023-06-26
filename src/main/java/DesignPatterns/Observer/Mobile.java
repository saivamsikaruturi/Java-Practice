package DesignPatterns.Observer;



public class Mobile implements Observer {
    @Override
    public void update(Stock stock) {
        System.out.println("Mobile - The price of  "+stock.getName()+" "+ stock.getPrice());
    }
}
