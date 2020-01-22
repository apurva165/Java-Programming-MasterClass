package section4;

public class TeenNumberChecker {
    public static void main(String[] args) {
        hasTeen(9, 99, 19);
        hasTeen(23, 15, 42);
        hasTeen(9, 99, 19);
    }

    public static boolean hasTeen(int param1, int param2, int param3) {
        if (param1 > 12 && param1 < 20) {
            return true;
        }
        if (param2 > 12 && param2 < 20) {
            return true;
        }
        return param3 > 12 && param3 < 20;
    }


    public static boolean isTeen(int param) {
        return param > 12 && param < 20;
    }

}
