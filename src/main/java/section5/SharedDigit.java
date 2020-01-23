package section5;

public class SharedDigit {
    public static void main(String[] args) {
        hasSharedDigit(12, 13);
    }

    public static boolean hasSharedDigit(int param1, int param2) {
        if (param1 < 10 || param1 > 99) {
            return false;
        }
        if (param2 < 10 || param2 > 99) {
            return false;
        }
        int currentNumberParam1 = 0;
        while (param1 > 0) {
            currentNumberParam1 = param1 % 10;
            System.out.println("Current param 1: " + currentNumberParam1);
            checkSecondWhile(currentNumberParam1, param2);
            param1 = param1 / 10;
        }
        return false;
    }

    public static boolean checkSecondWhile(int par1, int par2) {
        int currentParam2 = 0;
        while (par2 > 0) {
            currentParam2 = par2 % 10;
            System.out.println("Current param 2 : " + currentParam2);
            if (par2 == par1) {
                //System.out.println("TRUE");
                return true;
            }
            par2 = par2 / 10;
        }
        return false;
    }
}
