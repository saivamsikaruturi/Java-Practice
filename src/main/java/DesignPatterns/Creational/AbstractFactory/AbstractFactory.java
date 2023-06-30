package DesignPatterns.Creational.AbstractFactory;

public interface AbstractFactory<T,E> {
    T create(E type);
}
