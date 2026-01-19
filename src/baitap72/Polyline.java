package baitap72;

import java.util.*;

public class Polyline {
    private List<Point> points; // Sử dụng List (Interface) cho tính linh hoạt

    public Polyline() {
        points = new ArrayList<Point>(); // Khởi tạo ArrayList
    }

    public Polyline(List<Point> points) {
        this.points = points;
    }

    public void appendPoint(int x, int y) {
        points.add(new Point(x, y));
    }

    public void appendPoint(Point point) {
        points.add(point);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (Point p : points) {
            sb.append(p.toString());
        }
        sb.append("}");
        return sb.toString();
    }

    public double getLength() {
        double length = 0.0;
        for (int i = 0; i < points.size() - 1; i++) {
            length += points.get(i).distance(points.get(i+1));
        }
        return length;
    }
}
