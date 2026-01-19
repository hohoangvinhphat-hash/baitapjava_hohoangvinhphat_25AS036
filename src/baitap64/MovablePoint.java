package baitap64;

public class MovablePoint implements Movable {
    // Truy cập mức package (package access) như ký hiệu '~' trong sơ đồ
    int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + "), speed=(" + xSpeed + "," + ySpeed + ")";
    }

    @Override
    public void moveUp() { y -= ySpeed; } // Trong đồ họa, trừ y là đi lên

    @Override
    public void moveDown() { y += ySpeed; }

    @Override
    public void moveLeft() { x -= xSpeed; }

    @Override
    public void moveRight() { x += xSpeed; }
}