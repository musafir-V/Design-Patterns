package Decorator.CoffeStore;

public class WhippedCream extends AddOnDecorator {
    public WhippedCream(Beverage beverage) {
        super(beverage);
        System.out.println("Adding Whipped Cream");
    }

    public int cost() {

        return this.beverage.cost() + 1;
    }

}
