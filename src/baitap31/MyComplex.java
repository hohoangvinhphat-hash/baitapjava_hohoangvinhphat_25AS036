package baitap31;

public class MyComplex {

    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return this.real;
    }

    public double getImag() {
        return this.imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {

        if (imag >= 0) {
            return real + "+" + imag + "i";
        } else {

            return real + "" + imag + "i";
        }
    }

    public boolean isReal() {
        return this.imag == 0.0;
    }

    public boolean isImaginary() {
        return this.real == 0.0;
    }


    public boolean equals(double real, double imag) {
        return this.real == real && this.imag == imag;
    }

    public boolean equals(MyComplex another) {
        return equals(another.getReal(), another.getImag());
    }


    public double magnitude() {
        return Math.sqrt(this.real * this.real + this.imag * this.imag);
    }


    public MyComplex addInto(MyComplex right) {
        this.real += right.getReal();
        this.imag += right.getImag();
        return this; // Trả về instance đã được sửa đổi
    }


    public MyComplex addNew(MyComplex right) {
        double newReal = this.real + right.getReal();
        double newImag = this.imag + right.getImag();
        return new MyComplex(newReal, newImag); // Trả về một instance mới
    }

    public static void main(String[] args) {
        MyComplex c1 = new MyComplex(3.0, 4.0);
        MyComplex c2 = new MyComplex(-1.5, 2.5);
        MyComplex c3 = new MyComplex(3.0, 4.0);
        MyComplex c4 = new MyComplex(5.0, 0.0);
        MyComplex c5 = new MyComplex(0.0, -2.0);

        System.out.println("c1: " + c1.toString()); // c1: 3.0+4.0i
        System.out.println("c2: " + c2.toString()); // c2: -1.5+2.5i
        System.out.println("c5: " + c5.toString()); // c5: 0.0-2.0i

        System.out.println("c1 is Real? " + c1.isReal());      // false
        System.out.println("c4 is Real? " + c4.isReal());      // true
        System.out.println("c1 is Imaginary? " + c1.isImaginary()); // false
        System.out.println("c5 is Imaginary? " + c5.isImaginary()); // true

        System.out.println("c1 equals c3? " + c1.equals(c3));        // true
        System.out.println("c1 equals (3.0, 4.0)? " + c1.equals(3.0, 4.0)); // true

        System.out.println("Magnitude of c1: " + c1.magnitude()); // 5.0

        MyComplex sumNew = c1.addNew(c2);
        System.out.println("c1 + c2 (new): " + sumNew.toString()); // 1.5+6.5i
        System.out.println("c1 (after addNew): " + c1.toString()); // 3.0+4.0i (c1 không thay đổi)

        MyComplex c6 = new MyComplex(1.0, 1.0);
        MyComplex sumInto = c6.addInto(c2);
        System.out.println("c6 + c2 (into): " + sumInto.toString()); // -0.5+3.5i
        System.out.println("c6 (after addInto): " + c6.toString());  // -0.5+3.5i (c6 đã thay đổi)
    }
}