package baitap43;

public class TestPoint {
    public static void main(String[] args) {
        // Kiểm tra Point2D
        Point2D p2 = new Point2D(1.5f, 2.5f);
        System.out.println("Point 2D: " + p2); // Tự động gọi toString()

        // Kiểm tra Point3D
        Point3D p3 = new Point3D(10.0f, 20.0f, 30.0f);
        System.out.println("Point 3D ban đầu: " + p3);

        // Thử thay đổi tọa độ
        p3.setXYZ(5.5f, 6.6f, 7.7f);
        System.out.println("Point 3D sau khi setXYZ: " + p3);

        // Kiểm tra mảng trả về
        float[] coords = p3.getXYZ();
        System.out.println("Tọa độ z lấy từ mảng: " + coords[2]);
    }
}
