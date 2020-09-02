package Singleton.CofferBoiler;

public class Demo {
    public static void main(String [] args) {

        ChocolateBoiler obj1 = ChocolateBoiler.getInstance(true, false);
        ChocolateBoiler obj2 = ChocolateBoiler.getInstance(false, true);
        ChocolateBoiler obj3 = ChocolateBoiler.getInstance(false, false);
        
        // These statements shows that all objects (i.e. Obj1, Obj2, Obj2) refer 
        // to same memory....
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(obj3.toString());

        // These statements shows the same thing but in more specific way!!!
        System.out.println("Object1 ==> " + obj1.getIsBoiled() + " " + obj1.getIsEmpty());
        System.out.println("Object2 ==> " + obj2.getIsBoiled() + " " + obj2.getIsEmpty());
        System.out.println("Object3 ==> " + obj3.getIsBoiled() + " " + obj3.getIsEmpty());

    }
    
}