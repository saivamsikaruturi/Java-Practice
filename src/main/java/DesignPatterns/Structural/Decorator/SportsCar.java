package DesignPatterns.Structural.Decorator;

public class SportsCar extends CarDecorator{
    public SportsCar(Car car) {
        super(car);
    }
    @Override
    public void assemble(){
        super.assemble();
        System.out.println("Added Features for sports car");
    }
}