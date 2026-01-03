package baitap35;

public class MyDate {
    private int year, month, day;
    public static final String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static final String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    public static final int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999 || month < 1 || month > 12) return false;
        int maxDay = DAYS_IN_MONTHS[month - 1];
        if (month == 2 && isLeapYear(year)) maxDay = 29;
        return day >= 1 && day <= maxDay;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        // Thuật toán Sakamoto
        int[] t = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        if (month < 3) year -= 1;
        return (year + year/4 - year/100 + year/400 + t[month-1] + day) % 7;
    }

    public MyDate(int year, int month, int day) { setDate(year, month, day); }

    public void setDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) throw new IllegalArgumentException("Invalid date!");
        this.year = year; this.month = month; this.day = day;
    }

    public int getYear() { return year; }
    public int getMonth() { return month; }
    public int getDay() { return day; }

    public void setYear(int year) { if(isValidDate(year, month, day)) this.year = year; }
    public void setMonth(int month) { if(isValidDate(year, month, day)) this.month = month; }
    public void setDay(int day) { if(isValidDate(year, month, day)) this.day = day; }

    public String toString() {
        return DAYS[getDayOfWeek(year, month, day)] + " " + day + " " + MONTHS[month - 1] + " " + year;
    }

    public MyDate nextDay() {
        int maxDay = (month == 2 && isLeapYear(year)) ? 29 : DAYS_IN_MONTHS[month-1];
        if (++day > maxDay) { day = 1; nextMonth(); }
        return this;
    }

    public MyDate nextMonth() {
        if (++month > 12) { month = 1; nextYear(); }
        return this;
    }

    public MyDate nextYear() { year++; return this; }
}