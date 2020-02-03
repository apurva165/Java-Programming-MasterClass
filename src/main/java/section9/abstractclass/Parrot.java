package section9.abstractclass;

public class Parrot extends Bird {
    public Parrot(String name) {
        super(name);
    }


    @Override
    public void fly() {
        System.out.println("bird is flying");
    }
}
