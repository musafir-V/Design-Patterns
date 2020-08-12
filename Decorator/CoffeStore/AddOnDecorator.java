package CoffeStore;

public abstract class AddOnDecorator extends Beverage {
    Beverage beverage;

    public abstract int cost();

    public AddOnDecorator(Beverage beverage) {
        // super();
        this.beverage = beverage;
    }
}
