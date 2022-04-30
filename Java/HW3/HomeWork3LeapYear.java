public class HomeWork3LeapYear {

    public static void main(String[] args) {
        System.out.println(isLeapYear(2020)); // must print true

    }

    /**
     * Definition of leap year - https://en.wikipedia.org/wiki/Leap_year
     *
     * @param year - year according to Gregorian calendar
     * @return true if the year is leap, false otherwise
     */
    public static boolean isLeapYear(int year) {
        // TODO implement the method
        if (year % 400 == 0 || year % 4 == 0) {
            return true;
        }else{
            return false;
        }
    }
}

//finished