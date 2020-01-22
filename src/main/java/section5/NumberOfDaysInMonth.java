package section5;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        // isLeapYear(1924);
        getDaysInMonth(2, 2018);
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                return true;
            }
        }
        return year % 400 == 0;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        }
        if (year < 1 || year > 9999) {
            return -1;
        }

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 10:
            case 12:
            case 8:
                return 31;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            case 6:
            case 4:
            case 9:
            case 11:
                return 30;
            default:
                return -1;
        }
    }
}




