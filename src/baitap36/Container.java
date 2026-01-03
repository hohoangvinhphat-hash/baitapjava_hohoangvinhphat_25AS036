package baitap36;

public class Container {
    private int x1, y1, x2, y2;

    public Container(int x, int y, int width, int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x + width;
        this.y2 = y + height;
    }

    public boolean collides(Ball ball) {
        if (ball.getX() - ball.getRadius() <= x1 || ball.getX() + ball.getRadius() >= x2) {
            ball.reflectHorizontal();
            return true;
        }
        if (ball.getY() - ball.getRadius() <= y1 || ball.getY() + ball.getRadius() >= y2) {
            ball.reflectVertical();
            return true;
        }
        return false;
    }

    public String toString() {
        return "Container[(" + x1 + "," + y1 + "),(" + x2 + "," + y2 + ")]";
    }
}
