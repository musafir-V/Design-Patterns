package Decorator.CoffeStore;

public class Cappuccino extends Beverage {
    public Cappuccino() {
        System.out.println("Getting the Cappuccino");
    }

    public int cost() {
        return 4;
    }
}