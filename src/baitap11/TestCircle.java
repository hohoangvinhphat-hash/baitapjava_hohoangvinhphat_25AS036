package baitap11;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1);
        // e.g., Circle[radius=1.0,color=red]

        Circle c2 = new Circle(2.0);
        System.out.println(c2);
        // e.g., Circle[radius=2.0,color=red]

        c2.setRadius(3.5);
        c2.setColor("blue");
        System.out.println("radius is: " + c2.getRadius());
        System.out.println("area is: " + c2.getArea());
        System.out.println(c2);
        // e.g., Circle[radius=3.5,color=blue]
    }
}

