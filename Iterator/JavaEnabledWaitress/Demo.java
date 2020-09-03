package Iterator.JavaEnabledWaitress;

public class Demo {
    public static void main(String [] argsStrings) {
        PancakeMenu pancakeMenu = new PancakeMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();
        // Dummy Item
        pancakeMenu.addItems("Chicken Cake", "Yumm....", false, 29.99); 
        Waitress Penny = new Waitress(pancakeMenu, dinnerMenu);
        Penny.printFull();
    }
}