package baitap31;

public class TestMain {
    public static void main(String[] args) {

        System.out.println("--- 1. Constructors & toString() ---");
        MyComplex c1 = new MyComplex(); // Default constructor (0.0 + 0.0i)
        MyComplex c2 = new MyComplex(3.5, 4.2); // Parameterized constructor
        MyComplex c3 = new MyComplex(-1.0, -2.5);

        System.out.println("c1 (Default): " + c1.toString());
        System.out.println("c2 (3.5 + 4.2i): " + c2.toString());
        System.out.println("c3 (-1.0 - 2.5i): " + c3.toString());

        System.out.println("---");

        System.out.println("--- 2. Getters, Setters & setValue() ---");

        System.out.println("c2 Real: " + c2.getReal()); // 3.5
        System.out.println("c2 Imag: " + c2.getImag()); // 4.2

        c1.setReal(10.0);
        c1.setImag(-5.0);
        System.out.println("c1 after setReal/setImag: " + c1.toString()); // 10.0-5.0i

        c1.setValue(0.5, 0.5);
        System.out.println("c1 after setValue: " + c1.toString()); // 0.5+0.5i

        System.out.println("---");

        System.out.println("--- 3. isReal() & isImaginary() ---");
        MyComplex c4 = new MyComplex(7.0, 0.0); // Số thực
        MyComplex c5 = new MyComplex(0.0, -9.1); // Số thuần ảo

        System.out.println("c2 (" + c2 + "): isReal=" + c2.isReal() + ", isImaginary=" + c2.isImaginary());
        System.out.println("c4 (" + c4 + "): isReal=" + c4.isReal() + ", isImaginary=" + c4.isImaginary());
        System.out.println("c5 (" + c5 + "): isReal=" + c5.isReal() + ", isImaginary=" + c5.isImaginary());

        System.out.println("---");

        System.out.println("--- 4. magnitude() ---");

        System.out.printf("Magnitude of c2 (%s): %.4f%n", c2, c2.magnitude());

        System.out.println("---");

        System.out.println("--- 5. equals() ---");
        MyComplex c6 = new MyComplex(3.5, 4.2); // Giống c2


        System.out.println("c2 equals c6? " + c2.equals(c6)); // true
        System.out.println("c2 equals c3? " + c2.equals(c3)); // false


        System.out.println("c2 equals (3.5, 4.2)? " + c2.equals(3.5, 4.2)); // true
        System.out.println("c2 equals (4.2, 3.5)? " + c2.equals(4.2, 3.5)); // false

        System.out.println("---");


        System.out.println("--- 6. addInto(MyComplex) ---");
        MyComplex c7 = new MyComplex(1.0, 1.0);
        MyComplex c8 = new MyComplex(2.0, 3.0);

        System.out.println("Ban đầu: c7=" + c7 + ", c8=" + c8);


        MyComplex resultInto = c7.addInto(c8);

        System.out.println("Kết quả c7.addInto(c8): " + resultInto); // 3.0+4.0i
        System.out.println("Giá trị c7 sau khi cộng: " + c7);         // 3.0+4.0i (Đã thay đổi)
        System.out.println("---");


        System.out.println("--- 7. addNew(MyComplex) ---");
        MyComplex c9 = new MyComplex(5.0, 1.0);
        MyComplex c10 = new MyComplex(2.0, 3.0);

        System.out.println("Ban đầu: c9=" + c9 + ", c10=" + c10);


        MyComplex resultNew = c9.addNew(c10);

        System.out.println("Kết quả c9.addNew(c10): " + resultNew); // 7.0+4.0i
        System.out.println("Giá trị c9 sau khi cộng: " + c9);        // 5.0+1.0i (Không thay đổi)
        System.out.println("---");
    }
}