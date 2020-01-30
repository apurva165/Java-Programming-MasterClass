package section7.composition;


//composition shows has a relationship
// using composition we can call Classses into another class without being extending
public class Main {

    public static void main(String[] args) {
        Dimesions dimesions = new Dimesions(2, 2, 2);
        Case aCase = new Case("220", "Dell", "PWS", dimesions);


        Resolution resolution = new Resolution(3, 3);
        Monitor monitor = new Monitor("sony", "sony", 21, resolution);

        MotherBoard motherBoard = new MotherBoard("ap220", "seget", 2, 56, "v3.21");

        PC pc = new PC(aCase, monitor, motherBoard);
        pc.powerUp();

    }


}
