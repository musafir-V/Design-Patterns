package Iterator.JavaEnabledWaitress;

public class Waitress {
    private PancakeMenu pancakeMenu;
    private DinnerMenu dinnerMenu;

    public Waitress(PancakeMenu pancakeMenu, DinnerMenu dinnerMenu) {
        this.pancakeMenu = pancakeMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printFullMenu(Iterator it) {
        while(it.hasNext()) {
            MenuItem menuItem = (MenuItem) it.next();
            System.out.println("---------------------------------------");
            this.printMenuItem(menuItem);
            System.out.println("---------------------------------------");
        }
    }

    public void printVegMenu(Iterator it) {
        while(it.hasNext()) {
            MenuItem menuItem = (MenuItem) it.next();
            if(menuItem.getIsVeg()) {
                System.out.println("--------------------------------------");
                this.printMenuItem(menuItem);
                System.out.println("--------------------------------------");
            }
        }
    }

    public void printMenuItem(MenuItem menuItem) {
        System.out.println(menuItem.getName());
        System.out.println(menuItem.getDescription());
        System.out.println(menuItem.getIsVeg());
        System.out.println(menuItem.getPrice());
    }
    
    public void printFullPancackeMenu() {
        Iterator it = this.pancakeMenu.getIterator();
        this.printFullMenu(it);
    }

    public void printFullDinnerMenu() {
        Iterator it = this.dinnerMenu.getIterator();
        this.printFullMenu(it);
    }

    public void printVegPancakeMenu() {
        Iterator it = this.pancakeMenu.getIterator();
        printVegMenu(it);
    }

    public void printVegDinnerMenu() {
        Iterator it = this.dinnerMenu.getIterator();
        printVegMenu(it);
    }

    public void printFull() {
        System.out.println("-------------Full Start-----------");
        this.printFullPancackeMenu();
        this.printFullDinnerMenu();
        System.out.println("-------------Full End-----------");
    }

    public void printVeg() {
        System.out.println("-------------Veg Start-----------");
        this.printVegDinnerMenu();
        this.printVegPancakeMenu();
        System.out.println("-------------Veg End-------------");
    }
}