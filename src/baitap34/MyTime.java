package baitap34;

public class MyTime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public MyTime() {}

    public MyTime(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() { return hour; }
    public int getMinute() { return minute; }
    public int getSecond() { return second; }

    public void setHour(int hour) { this.hour = (hour >= 0 && hour <= 23) ? hour : 0; }
    public void setMinute(int minute) { this.minute = (minute >= 0 && minute <= 59) ? minute : 0; }
    public void setSecond(int second) { this.second = (second >= 0 && second <= 59) ? second : 0; }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public MyTime nextSecond() {
        if (++second == 60) {
            second = 0;
            nextMinute();
        }
        return this;
    }

    public MyTime nextMinute() {
        if (++minute == 60) {
            minute = 0;
            nextHour();
        }
        return this;
    }

    public MyTime nextHour() {
        if (++hour == 24) hour = 0;
        return this;
    }

    public MyTime previousSecond() {
        if (--second == -1) {
            second = 59;
            previousMinute();
        }
        return this;
    }

    public MyTime previousMinute() {
        if (--minute == -1) {
            minute = 59;
            previousHour();
        }
        return this;
    }

    public MyTime previousHour() {
        if (--hour == -1) hour = 23;
        return this;
    }
}