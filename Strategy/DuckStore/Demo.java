import java.util.Scanner;

public class Demo {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        Duck duck = new Duck();
        
        System.out.println("What fly behaviour do you want ????");
        int flyOption = sc.nextInt();
        if(flyOption == 0) {
            duck.setFlyBehaviour(new NoFly());
        } else if(flyOption == 1) {
            duck.setFlyBehaviour(new SimpleFly());
        } else if(flyOption == 2) {
            duck.setFlyBehaviour(new LowFly());
        } else {
            duck.setFlyBehaviour(new JetFly());
        }


        System.out.println("What Quack behaviour do you want ????");
        int quackOption = sc.nextInt();
        if(quackOption == 0) {
            duck.setQuackBehaviour(new SimpleQuack());
        } else if(quackOption == 1) {
            duck.setQuackBehaviour(new LowQuack());
        } else {
            duck.setQuackBehaviour(new HighQuack());
        }

        System.out.println("What display behaviour do you want ????");
        int displayOption = sc.nextInt();
        if(displayOption == 0) {
            duck.setDisplayBehaviour(new GraphicDisplay());
        } else {
            duck.setDisplayBehaviour(new TextDisplay());
        }

        duck.fly();
        duck.display();
        duck.quack();
        sc.close();
    }
}