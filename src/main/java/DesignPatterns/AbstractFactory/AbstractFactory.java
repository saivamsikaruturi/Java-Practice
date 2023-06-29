package DesignPatterns.AbstractFactory;

public interface AbstractFactory<T,E> {
    T create(E type);
}
