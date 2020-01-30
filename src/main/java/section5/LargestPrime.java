package section5;

public class LargestPrime {
    public static void main(String[] args) {
        getLargestPrime(45);
    }

    public static int getLargestPrime(int number) {
        if(number <= 1){
            return -1;
        }
        if(number == 2){
            return number;
        }
        int i;
        for (i = 2; i <= number; i++) {
            if (number % i == 0) {

                number = number / i;
                i--;
            }
        }
        System.out.println(i);
        return i;
    }
}
