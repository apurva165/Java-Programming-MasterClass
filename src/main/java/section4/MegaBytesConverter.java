package section4;

public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndkiloBytes(2500);
    }
    private static void printMegaBytesAndkiloBytes(int kiloBytes) {

        if(kiloBytes < 0) {
            System.out.println("Invalid value");
        }
        long megaBytes = kiloBytes/1024;
        long remainingKiloBytes = kiloBytes % 1024;

        System.out.println(kiloBytes + " KB = " + megaBytes + " MB " + " and " + remainingKiloBytes + " KB ");

    }
}
