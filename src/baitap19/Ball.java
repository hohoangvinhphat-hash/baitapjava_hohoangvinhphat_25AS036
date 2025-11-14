package baitap19;

public class Ball {
    // Thuộc tính
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    // Constructor
    public Ball(float x, float y, int radius, float xDelta, float yDelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    // Getter
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getXDelta() {
        return xDelta;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    // Di chuyển bóng một bước
    public void move() {
        x += xDelta;
        y += yDelta;
    }

    // Phản chiếu theo chiều ngang
    public void reflectHorizontal() {
        xDelta = -xDelta;
    }

    // Phản chiếu theo chiều dọc
    public void reflectVertical() {
        yDelta = -yDelta;
    }

    // toString: hiển thị trạng thái bóng
    public String toString() {
        return String.format("Ball[(%.2f,%.2f), speed=(%.2f,%.2f)]", x, y, xDelta, yDelta);
    }
}