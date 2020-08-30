package Decorator.CoffeStore;

public class CondensedMilk extends AddOnDecorator {
    public CondensedMilk(Beverage beverage) {
        super(beverage);
        System.out.println("Adding Condensed Milk");
    }

    public int cost() {
        return this.beverage.cost() + 2;
    }
}