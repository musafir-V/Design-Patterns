package CoffeStore;

public class VanillaExtract extends AddOnDecorator {
    public VanillaExtract(Beverage beverage) {
        super(beverage);
        System.out.println("Adding the Vannila Extract");
    }

    public int cost() {
        return this.beverage.cost() + 3;
    }

}