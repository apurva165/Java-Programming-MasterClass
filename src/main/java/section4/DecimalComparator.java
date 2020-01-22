package section4;

import java.text.DecimalFormat;

public class DecimalComparator {
    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        areEqualByThreeDecimalPlaces(3.175, 3.176);
        areEqualByThreeDecimalPlaces(3.0, 3.0);
        areEqualByThreeDecimalPlaces(-3.123, 3.123);
    }

    public static boolean areEqualByThreeDecimalPlaces(double param1, double param2) {
        param1 = 1000 * param1;
        param2 = 1000 * param2;

        int p1 = (int) param1;
        int p2 = (int) param2;

        return p1 == p2;

    }
}
