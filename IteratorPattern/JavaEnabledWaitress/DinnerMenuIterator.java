package IteratorPattern.JavaEnabledWaitress;

public class DinnerMenuIterator implements Iterator {
    private MenuItem[] menuItems;
    private int pos = 0;

    public DinnerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }
    
    public Object next() {
        MenuItem menuItem = menuItems[pos++];
        return menuItem;
    }   

    public boolean hasNext() {
        return pos < menuItems.length && menuItems[pos]!=null;
    }
}