package CoffeStore;

import java.util.Scanner;

public class Demo {
    public static Beverage getDecaf() {
        return new Decaf();
    }

    public static Beverage getEspresso() {
        return new Espresso();
    }

    public static Beverage getLatte() {
        return new Latte();
    }

    public static Beverage getCappuccino() {
        return new Cappuccino();
    }

    public static Beverage addWhippedCream(Beverage beverage) {
        return new WhippedCream(beverage);
    }

    public static Beverage addCondensedMilk(Beverage beverage) {
        return new CondensedMilk(beverage);
    }

    public static Beverage addVanillaExtract(Beverage beverage) {
        return new VanillaExtract(beverage);
    }

    public static Beverage addIceCream(Beverage beverage) {
        return new IceCream(beverage);
    }

    public static Beverage getBeverage(int typeOfBeverage) {
        switch (typeOfBeverage) {
            case 1:
                return getDecaf();
            case 2:
                return getEspresso();
            case 3:
                return getLatte();
            case 4:
                return getCappuccino();
            default:
                return null;
        }

    }

    public static Beverage mixAddOn(Beverage beverage, int typeOfAddOn) {
        switch (typeOfAddOn) {
            case 1:
                return addWhippedCream(beverage);
            case 2:
                return addCondensedMilk(beverage);
            case 3:
                return addVanillaExtract(beverage);
            case 4:
                return addIceCream(beverage);
            default:
                return null;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What Beverage do you want");
        int typeOfBeverage = sc.nextInt();
        Beverage beverage = getBeverage(typeOfBeverage);
        int wish = 1;
        do {
            System.out.println("What Add-On do you want");
            int typeOfAddOn = sc.nextInt();
            beverage = mixAddOn(beverage, typeOfAddOn);
            System.out.println("Do You Want to Add more Add On");
            wish = sc.nextInt();

        } while (wish == 1);
        System.out.println("" + beverage.cost());
        sc.close();
    }
}