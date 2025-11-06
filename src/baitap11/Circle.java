package baitap11;

public class Circle {

    private double radius;
    private String color;


    private static final double DEFAULT_RADIUS = 1.0;
    private static final String DEFAULT_COLOR = "red";


    public Circle() {
        this.radius = DEFAULT_RADIUS;
        this.color = DEFAULT_COLOR;
    }


    public Circle(double radius) {
        this.radius = radius;
        this.color = DEFAULT_COLOR;
    }

    public double getRadius() {
        return this.radius;
    }


    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }


    public String getColor() {
        return this.color;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }


    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Circle[radius=" + this.radius + ",color=" + this.color + "]";
    }
}

