package IteratorPattern.JavaEnabledWaitress;

public class MenuItem {
    String name;
    String description;
    boolean isVeg;
    double price;

    public MenuItem(String name, String description,
                    boolean isVeg, double price) {
        this.name = name;
        this.description = description;
        this.isVeg = isVeg;
        this.price = price;

    }
    public String getName() { return this.name; }
    
    public String getDescription() { return this.description; }
    
    public boolean getIsVeg() { return this.isVeg; }
    
    public double getPrice() { return this.price; }
}