package section5;

public class LastDigitChecker {
    public static void main(String[] args) {
        hasSameLastDigit(777, 771, 77);
    }

    public static boolean hasSameLastDigit(int param1, int param2, int param3) {
        if (param1 < 10 || param1 > 999) {
            return false;
        }
        if (param2 < 10 || param2 > 999) {
            return false;
        }
        if (param3 < 10 || param3 > 999) {
            return false;
        }

        int param1LastDigit = param1 % 10;
        int param2LastDigit = param2 % 10;
        int param3LastDigit = param3 % 10;
        System.out.println(param1LastDigit);
        System.out.println(param2LastDigit);
        System.out.println(param3LastDigit);

        if (param1LastDigit == param2LastDigit || param2LastDigit == param3LastDigit || param3LastDigit == param1LastDigit) {
            System.out.println("TRUE");
            return true;
        }
        return false;
    }

    public static boolean isValid(int param) {
        return param > 9 && param <= 1000;
    }

}
