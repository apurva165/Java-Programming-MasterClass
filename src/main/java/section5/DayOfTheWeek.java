package section5;

public class DayOfTheWeek {
    public static void main(String[] args) {
        printDayOfTheWeek(1000);
    }
    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("SUNDAY");
                break;
            case 1:
                System.out.println("TUESDAY");
                break;

            default:
                System.out.println("INVALID DAY");
        }

    }
}
