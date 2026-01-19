package baitap68;

public class MovablePoint implements Movable {
    int x, y, xSpeed, ySpeed; // Package access

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ") speed=(" + xSpeed + "," + ySpeed + ")";
    }

    @Override
    public void moveUp() {
        y -= ySpeed; // Trục y hướng xuống trong đồ họa 2D
    }

    @Override
    public void moveDown() {
        y += ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }
}
