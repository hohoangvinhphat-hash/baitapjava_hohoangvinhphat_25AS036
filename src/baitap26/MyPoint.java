package baitap26;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class MyPoint {

    private int x = 0;
    private int y = 0;


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
        // Distance = sqrt((x1 - x2)^2 + (y1 - y2)^2)
        return sqrt(pow(xDiff, 2) + pow(yDiff, 2));
    }


    public double distance(MyPoint another) {
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;

        return sqrt(pow(xDiff, 2) + pow(yDiff, 2));
    }

    public static void main(String[] args) {

        MyPoint p1 = new MyPoint(3, 4);  // (3, 4)
        MyPoint p2 = new MyPoint();     // (0, 0) - default constructor
        MyPoint p3 = new MyPoint(6, 8);  // (6, 8)

        System.out.println("--- Point 1 ---");
        System.out.println("Point 1: " + p1); // Calls toString() -> (3,4)
        System.out.println("X: " + p1.getX() + ", Y: " + p1.getY());

        System.out.println("\n--- Distance Calculations ---");


        System.out.printf("Distance from %s to (0,0): %.2f%n", p1, p1.distance()); // Expected: 5.00


        System.out.printf("Distance from %s to (6,8): %.2f%n", p1, p1.distance(6, 8)); // Expected: sqrt(9+16) = 5.00


        System.out.printf("Distance from %s to %s: %.2f%n", p1, p3, p1.distance(p3)); // Expected: 5.00


        p1.setXY(10, 20);
        int[] coords = p1.getXY();
        System.out.println("\n--- Testing Set/Get XY ---");
        System.out.println("New Point 1: " + p1); // Expected: (10,20)
        System.out.println("New coordinates from getXY(): {" + coords[0] + ", " + coords[1] + "}");
    }
}