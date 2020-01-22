package section4;

public class Main {
    public static void main(String[] args) {
        getDurationString(77, 51);
    }

    private static String getDurationString(int min, int sec) {
        if (min <= 0) {
            return "incorrect Input min ";
        }
        if (sec <= 0 || sec > 59) {
            return "incorrect Input Sec ";
        }
        int hours = min / 60;
        long remainingMins = min % 60;

        System.out.println(hours + " h " + remainingMins + " m " + sec + " s");

        String minAndSec = getDurationString(sec);

        return hours + " h " + minAndSec;
    }

    private static String getDurationString(int sec) {
        if(sec < 0){
            return "Invalid Arguments";
        }
        int min = sec/60;
        long remainigSec = sec % 60;

        return "min: " + min + "sec: " + remainigSec;


    }

}
