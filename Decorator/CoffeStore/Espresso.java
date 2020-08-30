package Decorator.CoffeStore;

public class Espresso extends Beverage {
    public Espresso() {
        System.out.println("Getting the Espresso");
    }

    public int cost() {
        return 2;
    }
}