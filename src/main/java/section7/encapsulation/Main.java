package section7.encapsulation;

//goal is to restict functions and variables to avoid changes in program.
public class Main {
    public static void main(String[] args) {
        Player pl = new Player();
        pl.name = "Tim";
        pl.health = 20;
        pl.weapon = "sword";

        int damage = 10;
        pl.loseHealth(damage);
        System.out.println("remaining health = " + pl.healthRemaining());

        damage = 11;
        pl.loseHealth(damage);
        System.out.println("remaining health : " + pl.healthRemaining());

    }

}
