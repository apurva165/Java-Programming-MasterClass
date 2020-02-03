package section9.abstractclass;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println( getName() +" : dog eating");
    }

    @Override
    public void breathe() {
        System.out.println("dog Breathing");

    }
}
