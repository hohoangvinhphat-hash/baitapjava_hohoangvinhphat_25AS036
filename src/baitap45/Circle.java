package baitap45;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
        super(); // Gọi constructor mặc định của Shape
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled); // Truyền tham số lên Shape
        this.radius = radius;
    }

    // ... các hàm getArea, getPerimeter ...
}