package baitap32;

public class TestMyPolynomial {
    public static void main(String[] args) {
        MyPolynomial p1 = new MyPolynomial(1, 2, 3);

        System.out.println("Đa thức p1: " + p1.toString());

        System.out.println("Giá trị p1 khi x=2: " + p1.evaluate(2));
    }
}
