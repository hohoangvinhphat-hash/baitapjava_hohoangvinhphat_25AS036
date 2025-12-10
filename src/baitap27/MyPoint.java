package baitap27;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;


public class MyPoint {

    private int x = 0; // Giá trị mặc định là 0
    private int y = 0; // Giá trị mặc định là 0


    public MyPoint() {
    }
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        return new int[]{x, y};
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double distance() {

        return distance(0, 0);
    }

    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        // Công thức khoảng cách: sqrt((x1 - x2)^2 + (y1 - y2)^2)
        return sqrt(pow(xDiff, 2) + pow(yDiff, 2));
    }

    public double distance(MyPoint another) {
        // Ủy quyền cho phương thức distance(int x, int y)
        return distance(another.getX(), another.getY());
    }
}