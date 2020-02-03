package section9.abstractclass;

public abstract class Bird extends Animal implements  CanFly{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("eating");
    }

    @Override
    public void breathe() {
        System.out.println("breathing");
    }

    public void fly() {
        System.out.println("i can fly constructor class");
    }
}
