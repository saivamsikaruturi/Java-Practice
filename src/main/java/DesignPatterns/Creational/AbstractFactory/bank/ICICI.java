package DesignPatterns.Creational.AbstractFactory.bank;

public class ICICI implements Bank {

    String name;

    public ICICI(){
        this.name = "ICICI";
    }

    @Override
    public String getBankName() {
        return name;
    }
}