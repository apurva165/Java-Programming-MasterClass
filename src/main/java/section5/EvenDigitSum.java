package section5;

public class EvenDigitSum {
    public static void main(String[] args) {
        getEvenDigitSum(252);
    }
    public static int getEvenDigitSum(int number){
        if(number < 0){
            return -1;
        }
        int sum = 0;
        int currentNumber = 0;
        while (number > 0){
            currentNumber = number % 10;
            if(currentNumber % 2 == 0){
                sum += currentNumber;
            }
            number = number / 10;
        }
       // System.out.println(sum);
        return sum;
    }
}
