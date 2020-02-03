package section9.interfacechallenge;

import static section9.interfacechallenge.Player.saveObject;

public class Main {

    public static void main(String[] args) {
        Player player1 = new Player("Player1", 100, 100);
        System.out.println(player1.toString());

        saveObject(player1);

        // player1.setHitPoints(50);;

        //  player1.toString();


    }


}
