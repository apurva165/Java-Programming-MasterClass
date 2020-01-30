package section7.oopmasterchallenge;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Solid", "chicken" , 3);
        hamburger.getTotalPrice();
        hamburger.addAdditionalItems("CHEESE");
        hamburger.getTotalPrice();
    }
}
