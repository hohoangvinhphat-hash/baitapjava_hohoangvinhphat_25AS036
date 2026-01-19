package baitap63;

public class MovablePoint implements Movable {
    // Truy cập mức package (~ trong sơ đồ)
    int x, y, xSpeed, ySpeed;

    // Constructor
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ") speed=(" + xSpeed + ", " + ySpeed + ")";
    }

    @Override
    public void moveUp() {
        y -= ySpeed; // Giảm y để đi lên
    }

    @Override
    public void moveDown() {
        y += ySpeed; // Tăng y để đi xuống
    }

    @Override
    public void moveLeft() {
        x -= xSpeed; // Giảm x để sang trái
    }

    @Override
    public void moveRight() {
        x += xSpeed; // Tăng x để sang phải
    }
}