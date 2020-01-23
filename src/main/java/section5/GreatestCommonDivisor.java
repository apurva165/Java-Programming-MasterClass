package section5;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        getGreatestCommonDivisor(12, 30);
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10) {
            return -1;
        }
        if (second < 10) {
            return -1;
        }

        int minNumber = 0;
        minNumber = Math.min(first, second);
        int greatestDivisor = 0;
        for (int i = 1; i <= minNumber; i++) {
            System.out.println("devisior : " + i);
            if (first % i == 0 && second % i == 0) {
                System.out.println("Common Divisor : " + i);
                greatestDivisor = i;
            }
        }
        System.out.println("greatest divisor : " + greatestDivisor);
         return greatestDivisor;
    }
}
