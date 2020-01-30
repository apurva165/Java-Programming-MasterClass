package section5;

public class FlourPackProblem {
    public static void main(String[] args) {
        canPack(2,2,11);
    }
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if(bigCount < 0 || smallCount < 0 || goal <0){
            return false;
        }
        int bigCountKilo = bigCount * 5;

        if( bigCountKilo + smallCount >= goal) {

        }
        int bigCountUsed = bigCount % goal;



        return true;
    }
}
