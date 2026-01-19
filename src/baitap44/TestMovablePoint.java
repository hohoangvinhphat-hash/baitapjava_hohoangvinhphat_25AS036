package baitap44;

public class TestMovablePoint {
    public static void main(String[] args) {

        System.out.println("--- Kiểm tra Point ---");
        Point p1 = new Point(1.0f, 2.0f);
        System.out.println("Điểm p1: " + p1.toString()); // Kết quả: (1.0,2.0)

        p1.setXY(3.5f, 4.5f);
        System.out.println("Sau khi setXY: " + p1);
        System.out.println();

        System.out.println("--- Kiểm tra MovablePoint ---");
        MovablePoint mp1 = new MovablePoint(0.0f, 0.0f, 1.5f, 2.5f);
        System.out.println("Vị trí ban đầu: " + mp1.toString());

        mp1.move();
        System.out.println("Sau 1 lần move: " + mp1.toString());

        mp1.move().move();
        System.out.println("Sau 2 lần move liên tiếp: " + mp1.toString());

    }
}