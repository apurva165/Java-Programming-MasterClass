package section5;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(1560);
        //     reverse(-566);
        //  getDigitCount(5623356);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        if(number == 0){
            System.out.println("Zero");
        }
        int singleNumber = 0;
       // System.out.println("Input Number : " + number);
        int reverseNumber = reverse(number);

        int numbOfZeros = getDigitCount(number) - getDigitCount(reverseNumber);
        while (reverseNumber > 0) {
            singleNumber = reverseNumber % 10;
            switch (singleNumber) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            reverseNumber = reverseNumber / 10;
        }
        for(int i = 1; i <= numbOfZeros; i++){
            System.out.println("Zero");
        }

    }

    public static int reverse(int num) {
        int lastDigit = 0;
        int newNumber = 0;
        while (Math.abs(num) > 0) {
            lastDigit = num % 10;
            newNumber = newNumber * 10 + lastDigit;
            num = num / 10;
        }
      //  System.out.println("reverse Output : " + newNumber);
        return newNumber;
    }

    public static int getDigitCount(int digit) {
        if (digit < 0) {
            return -1;
        }
        int count = 1;
        while (digit > 0) {

            digit = digit / 10;

            if (digit > 0) {

                count++;
            }
        }
    //    System.out.println(count);
        return count;
    }
}
