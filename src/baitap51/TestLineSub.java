package baitap51;

public class TestLineSub {
    public static void main(String[] args) {
        // Kiểm tra constructor của LineSub
        LineSub ls1 = new LineSub(1, 2, 4, 6);
        System.out.println("\nLớp LineSub (Inheritance):");
        System.out.println(ls1.toString()); // Sử dụng toString ghi đè
        System.out.println("Độ dài: " + ls1.getLength());

        // Kiểm tra việc lấy thông tin lớp cha (điểm bắt đầu)
        System.out.println("Tọa độ X bắt đầu: " + ls1.getX());

        // Kiểm tra constructor với đối tượng Point
        Point pBegin = new Point(10, 10);
        Point pEnd = new Point(20, 20);
        LineSub ls2 = new LineSub(pBegin, pEnd);
        System.out.println(ls2.toString());
    }
}
