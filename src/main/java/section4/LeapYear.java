package section4;

public class LeapYear {
    public static void main(String[] args) {
        isLeapYear(1924);
        // check();
        System.out.println("1924 % 4: " + (1924 % 4));
        System.out.println("1924 % 100: " + (1924 % 100));
        System.out.println("1924 % 400: " + (1924 % 400));
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    return year % 400 == 0;

                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }


    public static void check() {
        int year = 1924;
        boolean leap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                leap = year % 400 == 0;
            } else
                leap = true;
        } else
            leap = false;
        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}

//    public static boolean isLeapYear(int year) {
//        if (year >= 1 && year <= 9999) {
//
//
//            boolean leap = false;
//            if (year % 4 == 0) {
//                if (year % 100 == 0) {
//                    leap = year % 400 == 0;
//                } else
//                    leap = true;
//            } else
//                leap = false;
//            if (leap)
//                return true;
//            else
//                return false;
//        }
//        return false;
//    }