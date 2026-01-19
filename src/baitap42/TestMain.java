package baitap42;

public class TestMain {
    public static void main(String[] args) {
        // 1. Kiểm tra lớp Person
        System.out.println("--- Kiểm tra Person ---");
        Person p1 = new Person("Nguyen Van A", "123 Street, Hanoi");
        System.out.println(p1.toString());

        // Thay đổi địa chỉ
        p1.setAddress("456 Avenue, HCM City");
        System.out.println("Sau khi đổi địa chỉ: " + p1.getAddress());
        System.out.println(p1.toString());
        System.out.println();

        // 2. Kiểm tra lớp Student
        System.out.println("--- Kiểm tra Student ---");
        Student s1 = new Student("Le Thi B", "789 Road, Da Nang", "IT", 2023, 1500.5);
        System.out.println(s1.toString());

        // Thay đổi thông tin học tập
        s1.setYear(2024);
        s1.setFee(1600.0);
        System.out.println("Sau khi cập nhật: " + s1.toString());
        System.out.println();

        // 3. Kiểm tra lớp Staff
        System.out.println("--- Kiểm tra Staff ---");
        Staff st1 = new Staff("Tran Van C", "101 Lane, Hue", "BK High School", 1200.0);
        System.out.println(st1.toString());

        // Thay đổi lương và trường
        st1.setPay(1350.0);
        st1.setSchool("BK University");
        System.out.println("Tên nhân viên: " + st1.getName()); // Lấy từ lớp Person
        System.out.println("Thông tin mới: " + st1.toString());
    }
}