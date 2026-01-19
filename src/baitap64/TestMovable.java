package baitap64;

public class TestMovable {
    public static void main(String[] args) {
        // Kiểm tra MovablePoint
        Movable p1 = new MovablePoint(0, 0, 5, 5);
        System.out.println("Point ban đầu: " + p1);
        p1.moveRight();
        p1.moveDown();
        System.out.println("Point sau khi di chuyển: " + p1);

        // Kiểm tra MovableCircle
        Movable c1 = new MovableCircle(10, 10, 2, 2, 15);
        System.out.println("\nCircle ban đầu: " + c1);
        c1.moveUp();
        c1.moveLeft();
        System.out.println("Circle sau khi di chuyển: " + c1);
    }
}
