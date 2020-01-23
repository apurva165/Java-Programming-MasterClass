package section5;

import sun.util.resources.cldr.lag.CalendarData_lag_TZ;

public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        sumFirstAndLastDigit(257);
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int lastNumber = number % 10;
        int firstNumber = 0;
      //  System.out.println(lastNumber);
        //   int firstNumber =0;
        while (number > 0) {
            firstNumber = number % 10;
            number = number / 10;
        }
       // System.out.println(lastNumber +firstNumber);
        return lastNumber + firstNumber;
    }
}
