package section5;

public class DigitSumChallenge {
    public static void main(String[] args) {
          sumDigits(128);

    }

    public static int sumDigits(int number) {
        int sum = 0;
        if (number < 2) {
            return -1;
        }
        if (number <= 10) {

            for (int i = 1; i <= number; i++) {
                sum += i;
            }
            return sum;
        }
        while (number > 0) {
            //extract least significant digit
            int digit = number % 10;
            sum += digit;
            //drop least sig digit
            number = number / 10;
        }
        System.out.println(sum);
        return sum;
    }
}
