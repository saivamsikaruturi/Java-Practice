package DesignPatterns.Observer;

import com.vamsi.javaPractice.DesignPatterns.Observer.Observer;

public interface Observable {
    public void registerObserver(com.vamsi.javaPractice.DesignPatterns.Observer.Observer observer);

    public void notifyObservers();

    public void removeObserver(Observer observer);
}
