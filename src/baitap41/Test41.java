package baitap41;

public class Test41 {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.0, "blue");
        System.out.println(c1);
        System.out.println("Area: " + c1.getArea());

        Cylinder cy1 = new Cylinder(2.0, 5.0, "yellow");
        System.out.println(cy1);
        // Cylinder dùng getArea() của Circle để tính Volume
        System.out.println("Volume: " + cy1.getVolume());
    }
}
