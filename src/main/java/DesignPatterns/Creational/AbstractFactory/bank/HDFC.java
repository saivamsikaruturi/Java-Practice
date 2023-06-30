package DesignPatterns.Creational.AbstractFactory.bank;

public class HDFC implements Bank {

    String name;

    public HDFC(){
        this.name = "HDFC";
    }

    @Override
    public String getBankName() {
        return name;
    }
}