package baitap51;

public class Line {
    private Point begin; // Điểm bắt đầu
    private Point end;   // Điểm kết thúc

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Line(int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY); // Khởi tạo điểm mới
        end = new Point(endX, endY);
    }

    public String toString() {
        return "Line[begin=" + begin + ",end=" + end + "]";
    }

    // Getter và Setter cho Point
    public Point getBegin() { return begin; }
    public void setBegin(Point begin) { this.begin = begin; }
    public Point getEnd() { return end; }
    public void setEnd(Point end) { this.end = end; }

    // Các phương thức lấy tọa độ trực tiếp
    public int getBeginX() { return begin.getX(); }
    public void setBeginX(int x) { begin.setX(x); }
    public int getBeginY() { return begin.getY(); }
    public void setBeginY(int y) { begin.setY(y); }

    public int getEndX() { return end.getX(); }
    public void setEndX(int x) { end.setX(x); }
    public int getEndY() { return end.getY(); }
    public void setEndY(int y) { end.setY(y); }

    public int getLength() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return (int) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double getGradient() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.atan2(yDiff, xDiff);
    }
}