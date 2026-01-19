package baitap51;

public class TestLine {
    public static void main(String[] args) {
        // Kiểm tra constructor với tọa độ int
        Line l1 = new Line(0, 0, 3, 4);
        System.out.println("Lớp Line (Composition):");
        System.out.println(l1.toString());
        System.out.println("Độ dài: " + l1.getLength());
        System.out.println("Góc (Gradient): " + l1.getGradient());

        // Kiểm tra constructor với đối tượng Point
        Point p1 = new Point(5, 5);
        Point p2 = new Point(10, 10);
        Line l2 = new Line(p1, p2);
        System.out.println(l2.toString());

        // Thay đổi tọa độ điểm bắt đầu của l2
        l2.setBeginX(8);
        System.out.println("Sau khi đổi beginX: " + l2);
    }
}
