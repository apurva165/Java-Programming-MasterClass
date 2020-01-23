package section5;

public class NumberPalindrome {
    public static void main(String[] args) {
        isPalindrome(-222);
    }
    public static boolean isPalindrome(int number) {

        int reverseNumber = 0;
        int originalNumber = Math.abs(number);
        int absNumber = Math.abs(number);
        while (absNumber > 0) {
            //    System.out.println("Number : " + number );
            int lastDigit = (absNumber % 10);
            reverseNumber = reverseNumber * 10 + lastDigit;
            //   System.out.println("reverse Number : " +reverseNumber);
            absNumber = absNumber / 10;
        }
        // System.out.println(reverseNumber);
        // System.out.println(originalNumber);
        return reverseNumber == originalNumber;
    }
}
