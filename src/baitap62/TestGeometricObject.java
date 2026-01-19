package baitap62;

public class TestGeometricObject {
    public static void main(String[] args) {
        // Khởi tạo đối tượng thông qua Interface (Tính đa hình)
        GeometricObject g1 = new Circle(5.0);
        System.out.println(g1.toString());
        System.out.printf("Area: %.2f%n", g1.getArea());
        System.out.printf("Perimeter: %.2f%n", g1.getPerimeter());

        GeometricObject g2 = new Rectangle(2.0, 4.0);
        System.out.println("\n" + g2.toString());
        System.out.printf("Area: %.2f%n", g2.getArea());
        System.out.printf("Perimeter: %.2f%n", g2.getPerimeter());
    }
}