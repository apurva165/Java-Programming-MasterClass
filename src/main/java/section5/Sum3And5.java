package section5;

public class Sum3And5 {
    public static void main(String[] args) {
        sumThreeAndFive();
    }

    public static int sumThreeAndFive() {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("i = :" + i);
                sum += i;
                count++;
                if (count == 5) {

                    System.out.println("SUM : " + sum);
                    return sum;
                }
            }
        }
        return sum;
    }
}
