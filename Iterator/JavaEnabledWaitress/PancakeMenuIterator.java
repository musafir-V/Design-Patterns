package Iterator.JavaEnabledWaitress;

import java.util.ArrayList;

public class PancakeMenuIterator implements Iterator {
    ArrayList<MenuItem> menuItems;
    int pos = 0;

    public PancakeMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Object next() {
        MenuItem menuItem = this.menuItems.get(pos);
        pos++;
        return menuItem;
    }

    public boolean hasNext() {
        return menuItems.size() >= pos + 1;
    }
}