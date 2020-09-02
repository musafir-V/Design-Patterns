package IteratorPattern.JavaEnabledWaitress;

import java.util.ArrayList;

public class PancakeMenu implements Menu {

    ArrayList<MenuItem> menuItems;
    
    public PancakeMenu() {
        this.menuItems = new ArrayList<MenuItem>();
        // Default Menu
        this.addItems("Chocolate Pancakae", "Made of Best Chocolate", true, 15.99);
    }
    public void addItems(String name,String description, boolean isVeg, double price) {
        this.menuItems.add(new MenuItem(name, description, isVeg, price));
    }

    public Iterator getIterator() {
        return new PancakeMenuIterator(this.menuItems);
    }
}