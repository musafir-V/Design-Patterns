package IteratorPattern.JavaEnabledWaitress;

public class DinnerMenu implements Menu{
    static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;
    
    public DinnerMenu() {
        this.menuItems = new MenuItem[MAX_ITEMS];
        // Default Menu....
        this.addItem("Daal", "Yellow Dal with Tadka", true, 199);
        this.addItem("Rice", "White Basmati Rice", true, 149);
        this.addItem("Roti", "Soft Chapatis", true, 20);
        this.addItem("Chicken Kolhapuri", "High Masala", false, 195);
    }

    public void addItem(String name, String description, boolean isVeg, double price) {
        if(this.numberOfItems == DinnerMenu.MAX_ITEMS) throw new ArrayIndexOutOfBoundsException("Max Food Items in Menu can only be 6");
        this.menuItems[numberOfItems] = new MenuItem(name, description, isVeg, price);
        numberOfItems++;
    }

    public Iterator getIterator() {
        return new DinnerMenuIterator(this.menuItems);
    }

}