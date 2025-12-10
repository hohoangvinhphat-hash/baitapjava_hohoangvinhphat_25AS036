package baitap28;

public class TestMain {

    public static void main(String[] args) {

        System.out.println("### KIỂM THỬ LỚP MyCircle ###");


        System.out.println("\n--- 1. Constructors và toString() ---");

        MyCircle cDefault = new MyCircle();
        System.out.println("cDefault: " + cDefault);

        MyCircle cA = new MyCircle(3, 4, 5);
        System.out.println("cA: " + cA);

        MyPoint centerB = new MyPoint(10, 10);
        MyCircle cB = new MyCircle(centerB, 2);
        System.out.println("cB: " + cB);


        System.out.println("\n--- 2. Getters và Setters Test ---");


        System.out.println("cA Bán kính: " + cA.getRadius());
        cA.setRadius(7);
        System.out.println("cA Bán kính mới: " + cA.getRadius());

        System.out.println("cA Tâm X: " + cA.getCenterX());
        cA.setCenterY(8);
        System.out.println("cA Tâm mới: " + cA.getCenter());

        cA.setCenterXY(1, 1);
        System.out.println("cA Tâm sau setCenterXY: " + cA);


        System.out.println("\n--- 3. Logic: Area, Circumference, Distance ---");

        System.out.printf("cA Diện tích (Area): %.2f%n", cA.getArea());

        System.out.printf("cA Chu vi (Circumference): %.2f%n", cA.getCircumference());

        System.out.println("\nKiểm tra khoảng cách giữa hai hình tròn:");
        System.out.println("cA: " + cA.getCenter() + ", cB: " + cB.getCenter());
        System.out.printf("Khoảng cách giữa hai tâm: %.2f%n", cA.distance(cB)); // Expected: 12.73
    }
}