package baitap63;

public class TestMovable {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(5, 6, 10, 15);     // Khởi tạo đa hình
        System.out.println("Vị trí ban đầu: " + m1);

        m1.moveLeft();
        System.out.println("Sau khi sang trái: " + m1);

        m1.moveUp();
        System.out.println("Sau khi lên trên: " + m1);

        m1.moveRight();
        m1.moveDown();
        System.out.println("Sau khi sang phải và đi xuống: " + m1);
    }
}
