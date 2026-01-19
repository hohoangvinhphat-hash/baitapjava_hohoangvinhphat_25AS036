package baitap65;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return "ResizableCircle[" + super.toString() + "]";
    }

    @Override
    public void resize(int percent) {
        // Công thức theo ghi chú trong UML: radius *= percent / 100.0
        this.radius *= percent / 100.0;
    }
}