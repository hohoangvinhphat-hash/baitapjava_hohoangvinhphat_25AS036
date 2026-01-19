package baitap72;

public class Point {
    private int x, y;
    public Point(int x, int y) { this.x = x; this.y = y; }
    public String toString() { return "(" + x + "," + y + ")"; }

    public double distance(Point another) {
        return Math.sqrt(Math.pow(this.x - another.x, 2) + Math.pow(this.y - another.y, 2));
    }
}
