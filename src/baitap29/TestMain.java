package baitap29;


public class TestMain {

    public static void main(String[] args) {

        System.out.println("### KIỂM THỬ LỚP MyTriangle ###");

        System.out.println("\n--- 1. Constructors và toString() ---");


        MyTriangle t1 = new MyTriangle(0, 0, 4, 0, 2, 3);
        System.out.println("t1: " + t1);

        MyPoint v1 = new MyPoint(0, 0);
        MyPoint v2 = new MyPoint(10, 0);

        MyPoint v3 = new MyPoint(5, 8);
        MyTriangle t2 = new MyTriangle(v1, v2, v3);
        System.out.println("t2: " + t2);

        MyTriangle t3 = new MyTriangle(1, 1, 3, 4, 7, 2);
        System.out.println("t3: " + t3);

        System.out.println("\n--- 2. getPerimeter() và getType() ---");

        System.out.println("\nKiểm tra t1 (Cân): " + t1);
        System.out.printf("Chu vi: %.3f%n", t1.getPerimeter()); // Expected: ≈ 11.211
        System.out.println("Loại tam giác: " + t1.getType());   // Expected: Isosceles

        System.out.println("\nKiểm tra t2 (Cân): " + t2);
        System.out.printf("Chu vi: %.3f%n", t2.getPerimeter()); // Expected: ≈ 28.868
        System.out.println("Loại tam giác: " + t2.getType());   // Expected: Isosceles


        System.out.println("\nKiểm tra t3 (Thường): " + t3);
        System.out.printf("Chu vi: %.3f%n", t3.getPerimeter()); // Expected: ≈ 14.159
        System.out.println("Loại tam giác: " + t3.getType());   // Expected: Scalene
    }
}
