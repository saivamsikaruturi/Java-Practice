package DesignPatterns.Observer;

import com.vamsi.javaPractice.DesignPatterns.Observer.Observer;
import com.vamsi.javaPractice.DesignPatterns.Observer.Stock;

public class DisplayBoard implements Observer {
    @Override
    public void update(Stock stock) {
        System.out.println("DisplayBoard - The price of  "+stock.getName()+" "+ stock.getPrice());
    }
}
