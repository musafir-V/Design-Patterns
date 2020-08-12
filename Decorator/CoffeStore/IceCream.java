package CoffeStore;

public class IceCream extends AddOnDecorator {
    public IceCream(Beverage beverage) {
        super(beverage);
        System.out.println("Adding Ice-Cream");
    }

    public int cost() {

        return this.beverage.cost() + 4;
    }
}