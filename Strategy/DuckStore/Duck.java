package Strategy.DuckStore;

public class Duck {
    IDisplayBehaviour displayBehaviour;
    IQuackBehaviour quackBehaviour;
    IFlyBehaviour flyBehaviour;

    public Duck() {
        this.displayBehaviour = new GraphicDisplay();
        this.quackBehaviour = new SimpleQuack();
        this.flyBehaviour = new NoFly();
    }

    public void setDisplayBehaviour(IDisplayBehaviour displayBehaviour) {
        this.displayBehaviour = displayBehaviour;
    }

    public void setFlyBehaviour(IFlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(IQuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void fly() {
        this.flyBehaviour.fly();
    }

    public void quack() {
        this.quackBehaviour.quack();
    }

    public void display() {
        this.displayBehaviour.display();
    }
}