package baitap52;

public class TestCylinder {
    public static void main(String[] args) {
        // 1. Kiểm tra constructor mặc định
        Cylinder cy1 = new Cylinder();
        System.out.println("--- Hình trụ 1 (Mặc định) ---");
        System.out.println("Thông tin: " + cy1.toString());
        System.out.println("Bán kính đáy: " + cy1.getRadius());
        System.out.println("Chiều cao: " + cy1.getHeight());
        System.out.println("Diện tích đáy: " + cy1.getBaseArea());
        System.out.println("Thể tích: " + cy1.getVolume());

        // 2. Kiểm tra constructor có tham số (bán kính 2.5, chiều cao 5.0)
        Cylinder cy2 = new Cylinder(2.5, 5.0);
        System.out.println("\n--- Hình trụ 2 (Tham số) ---");
        System.out.println("Thông tin: " + cy2.toString());
        System.out.println("Thể tích: " + cy2.getVolume());

        // 3. Kiểm tra việc thay đổi thuộc tính thông qua đối tượng 'base' bên trong
        cy2.setColor("blue");
        cy2.setHeight(10.0);
        System.out.println("\n--- Hình trụ 2 sau khi thay đổi ---");
        System.out.println("Màu sắc mới: " + cy2.getColor());
        System.out.println("Chiều cao mới: " + cy2.getHeight());
        System.out.println("Thể tích mới: " + cy2.getVolume());
    }
}