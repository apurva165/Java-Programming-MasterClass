package section5;

public class PerfectNumber {
    public static void main(String[] args) {
    isPerfectNumber(28);
    }
    public static boolean isPerfectNumber(int num){
        if(num < 1){
            return false;
        }
        int sum = 0;
        for(int i = 1; i < num; i++){
            if(num % i == 0){
                System.out.println(i);
                sum+= i;
            }
        }
        return sum == num;
    }
}
