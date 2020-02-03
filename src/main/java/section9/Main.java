package section9;

public class  Main {
    public static void main(String[] args) {
        // Interface Name
        ITelephone telephone;

        //class instance using interface
        telephone = new DeskPhone(11, false);
        telephone.powerOn();
        telephone.callPhone(11);

        telephone = new MobilePhone(12152, false);
        telephone.callPhone(2454);
        telephone.answer();
    }
}
