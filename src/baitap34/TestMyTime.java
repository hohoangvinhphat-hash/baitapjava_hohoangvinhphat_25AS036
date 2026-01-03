package baitap34;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime t1 = new MyTime(23, 59, 58);
        System.out.println("Thời gian bắt đầu: " + t1); // 23:59:58

        System.out.println("Cộng 1 giây: " + t1.nextSecond()); // 23:59:59
        System.out.println("Cộng 1 giây: " + t1.nextSecond()); // 00:00:00 (qua ngày mới)

        t1.setTime(0, 0, 0);
        System.out.println("Trừ 1 giây: " + t1.previousSecond()); // 23:59:59

        t1.setHour(12);
        System.out.println("Giờ hiện tại: " + t1.getHour()); // 12
    }
}