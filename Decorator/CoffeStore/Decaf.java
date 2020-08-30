package Decorator.CoffeStore;

public class Decaf extends Beverage {
    public Decaf() {
        System.out.println("Getting the Decaf");
    }

    public int cost() {
        return 1;
    }
}