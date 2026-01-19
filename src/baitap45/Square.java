package baitap45;

public class Square extends Rectangle {
    public Square() {}
    public Square(double side) {
        super(side, side); // width = length = side
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() { return getWidth(); }
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side); // Đảm bảo tính chất hình vuông
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side); // Đảm bảo tính chất hình vuông
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
