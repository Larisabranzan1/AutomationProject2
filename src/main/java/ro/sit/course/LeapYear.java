package ro.sit.course;

public class LeapYear {
    public static void main(String[] args) {
        for (int year = 1900; year <= 2016; year++) {
            int month = 2; // February
            int numberOfDays = getNumberOfDaysInMonth(month, year);
            System.out.println("Year: " + year + ", Number of days in February: " + numberOfDays);
        }
    }

    public static int getNumberOfDaysInMonth(int month, int year) {
        if (month == 2 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            return 29; // Leap year
        } else {
            return 28; // Non-leap year
        }
    }
}






