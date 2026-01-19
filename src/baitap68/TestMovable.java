package baitap68;

public class TestMovable {
    public static void main(String[] args) {
        // 1. Kiểm tra MovablePoint
        Movable m1 = new MovablePoint(5, 6, 10, 15); // Upcast
        System.out.println("Điểm ban đầu: " + m1);
        m1.moveLeft();
        System.out.println("Sau khi sang trái: " + m1);

        // 2. Kiểm tra MovableCircle
        Movable m2 = new MovableCircle(1, 1, 2, 2, 20); // Upcast
        System.out.println("\nHình tròn ban đầu: " + m2);
        m2.moveRight();
        System.out.println("Sau khi sang phải: " + m2);

        // 3. Kiểm tra MovableRectangle
        Movable m3 = new MovableRectangle(0, 0, 5, 5, 2, 2);
        System.out.println("\nHình chữ nhật ban đầu: " + m3);
        m3.moveUp();
        System.out.println("Sau khi lên trên: " + m3);
    }
}