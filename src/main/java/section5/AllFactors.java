package section5;

public class AllFactors {
    public static void main(String[] args) {
   // printFactors(10);
    }
    public static void printFactors(int num){
        if(num < 1){
            System.out.println("Invalid Value");
        }
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                System.out.println(i);
            }
        }
    }

}
