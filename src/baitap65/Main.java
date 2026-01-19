package baitap65;

public class Main {
    public static void main(String[] args) {
        ResizableCircle rc = new ResizableCircle(100.0);
        System.out.println("Ban đầu: " + rc);
        System.out.println("Diện tích: " + rc.getArea());

        rc.resize(50); // Giảm 50%
        System.out.println("Sau khi resize 50%: " + rc);
        System.out.println("Diện tích mới: " + rc.getArea());
    }
}
