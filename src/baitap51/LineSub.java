package baitap51;

public class LineSub extends Point {
    private Point end; // Điểm kết thúc

    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY); // Gọi constructor lớp cha (Point) cho điểm bắt đầu
        this.end = new Point(endX, endY);
    }

    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY()); // Trích xuất tọa độ từ begin
        this.end = end;
    }

    @Override
    public String toString() {
        return "LineSub[begin=" + super.toString() + ",end=" + end + "]";
    }

    // Điểm bắt đầu chính là bản thân đối tượng này (this) thông qua lớp cha
    public Point getBegin() { return new Point(super.getX(), super.getY()); }
    public Point getEnd() { return end; }

    public int getLength() {
        int xDiff = end.getX() - super.getX();
        int yDiff = end.getY() - super.getY();
        return (int) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
}
