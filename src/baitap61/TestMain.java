package baitap61;

import java.net.SocketOption;
import java.sql.SQLOutput;

public class TestMain {
    static void main(String[] args) {
        Shape s1 = new Circle("red", false, 5.5);  // Upcast Circle to Shape
        System.out.println(s1);                    // which version?
        System.out.println(s1.getArea());          // which version?
        System.out.println(s1.getPerimeter());     // which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        System.out.println(((Circle) s1).getRadius());

        Circle c1 = (Circle) s1;                   // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        Square square = new Square();
        System.out.println(square.getSide());
        System.out.println(square.getArea());
        Square square1= new Square(10);
        System.out.println(square1.getArea());
        System.out.println(square1.getWidth());
        System.out.println(square1.getLength());
        System.out.println(square1.toString());

        Rectangle r1 =new Rectangle();
        System.out.println(r1.getWidth());
        System.out.println(r1.getLength());
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        r1.setLength(80);
        r1.setWidth(70);
        System.out.println(r1.getLength());
        System.out.println(r1.getWidth());
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());


    }
}
