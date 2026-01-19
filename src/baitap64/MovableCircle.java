package baitap64;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center; // Quan hệ Composition (Thành phần)

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        // Khởi tạo thực thể MovablePoint bên trong
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return center.toString() + ",radius=" + radius;
    }

    // Chuyển tiếp (delegate) các yêu cầu di chuyển cho đối tượng center
    @Override
    public void moveUp() { center.moveUp(); }

    @Override
    public void moveDown() { center.moveDown(); }

    @Override
    public void moveLeft() { center.moveLeft(); }

    @Override
    public void moveRight() { center.moveRight(); }
}
