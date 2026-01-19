package baitap52;

public class Cylinder {
    private Circle base; // Thành phần (Composition)
    private double height;

    // Constructor mặc định
    public Cylinder() {
        base = new Circle(); // Khởi tạo đối tượng Circle bên trong
        height = 1.0;        //
    }

    // Constructor với tham số radius và height
    public Cylinder(double radius, double height) {
        base = new Circle(radius);
        this.height = height;
    }

    // Constructor với đầy đủ tham số
    public Cylinder(double radius, double height, String color) {
        base = new Circle(radius, color);
        this.height = height;
    }

    // Getters và Setters
    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    // Truy cập các thuộc tính của Circle thông qua đối tượng 'base'
    public double getRadius() { return base.getRadius(); }
    public void setRadius(double radius) { base.setRadius(radius); }
    public String getColor() { return base.getColor(); }
    public void setColor(String color) { base.setColor(color); }

    // Tính diện tích đáy bằng cách gọi phương thức của lớp Circle
    public double getBaseArea() {
        return base.getArea();
    }

    // Tính thể tích hình trụ
    public double getVolume() {
        return getBaseArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder[base=" + base.toString() + ", height=" + height + "]";
    }
}
