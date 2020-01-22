package section4;

public class SpeedConverter {
    public static void main(String[] args) {
        toMilesPerHour(75.114);
    }
    private static long toMilesPerHour(double kmsPerHr) {
        if(kmsPerHr <= 0) {
            return -1;
        }
        long miles = Math.round(kmsPerHr / 1.6);
        System.out.println("Miles : " + miles);
        return miles;
    }
}
