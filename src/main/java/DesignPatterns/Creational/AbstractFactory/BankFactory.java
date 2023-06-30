package DesignPatterns.Creational.AbstractFactory;

import DesignPatterns.Creational.AbstractFactory.bank.*;
import DesignPatterns.Creational.AbstractFactory.exception.ObjectCreationException;

public class BankFactory implements AbstractFactory<Bank, BankType> {

    @Override
    public Bank create(BankType type) {
        switch (type){
            case SBI: return new SBI();
            case HDFC: return new HDFC();
            case ICICI: return new ICICI();
            default: throw new ObjectCreationException("invalid bank");
        }
    }
}