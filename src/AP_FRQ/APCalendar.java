package AP_FRQ;

public class APCalendar {

    private static int numberOfLeapYears(int year1, int year2) {
        int x = 0;
        for (int i = year1; i <= year2; i++) {
            if (isLeapYear(i)) x++;
        }
        return x;
    }
    private static boolean isLeapYear(int i) {
        return i%4 == 0;
    }
    private static int firstDayOfYear(int year) {
        return 0;
    }
    private static int dayOfYear(int month, int day, int year) {
        return 30*(month-1) + day;
    }
    public static int dayOfWeek(int month, int day, int year) {
        int days = firstDayOfYear(year);
        days += dayOfYear(month, day, year);
        return days % 7;
    }

    public static void main (String[] args) {
        System.out.println (numberOfLeapYears(2000, 2022));
        System.out.println (dayOfWeek(1, 30, 2022));
    }


}
