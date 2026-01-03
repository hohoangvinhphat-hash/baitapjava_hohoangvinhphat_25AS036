package baitap35;

public class TestMyDate {
    public static void main(String[] args) {
        MyDate d1 = new MyDate(2012, 2, 28);
        System.out.println("Ngày bắt đầu: " + d1); // Tuesday 28 Feb 2012

        System.out.println("Ngày tiếp theo: " + d1.nextDay()); // Wednesday 29 Feb 2012 (năm nhuận)
        System.out.println("Ngày tiếp theo: " + d1.nextDay()); // Thursday 1 Mar 2012

        MyDate d2 = new MyDate(2012, 12, 31);
        System.out.println("Ngày cuối năm: " + d2.nextDay()); // Tuesday 1 Jan 2013

        // Kiểm tra tính hợp lệ
        System.out.println("Hợp lệ (2024-02-29): " + MyDate.isValidDate(2024, 2, 29)); // true
    }
}
