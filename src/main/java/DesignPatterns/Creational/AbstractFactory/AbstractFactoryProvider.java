package DesignPatterns.Creational.AbstractFactory;

import DesignPatterns.Creational.AbstractFactory.exception.ObjectCreationException;

public class AbstractFactoryProvider {

    public static AbstractFactory getFactory(ObjectType objectType){

        switch (objectType){
            case BANK: return new BankFactory();
            case LOAN: return new LoanFactory();
            default: throw new ObjectCreationException(objectType.toString());
        }
    }
}