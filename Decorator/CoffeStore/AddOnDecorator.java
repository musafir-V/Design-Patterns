package Decorator.CoffeStore;

public abstract class AddOnDecorator extends Beverage {
    Beverage beverage;

    public abstract int cost();

    public AddOnDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
