package section4;

public class MinutesToYearsAndDays {
    public static void main(String[] args) {
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(minutes + " min = " + minutes / 60 / 24 / 365 + " y and " + minutes / 60 / 24 % 365 + " d");
            //  System.out.println("years" + minutes / 60 / 24 / 365);
            //  System.out.println("remainingDays" + minutes / 60 / 24 % 365);
        }
    }
}
