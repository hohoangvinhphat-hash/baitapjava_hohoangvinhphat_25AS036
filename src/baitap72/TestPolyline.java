package baitap72;

import java.util.*;

public class TestPolyline {
    public static void main(String[] args) {
        // 1. Kiểm tra constructor mặc định và phương thức toString()
        Polyline l1 = new Polyline();
        System.out.println("Polyline 1 (trống): " + l1); // Kết quả: {}

        // 2. Kiểm tra appendPoint(int x, int y)
        l1.appendPoint(1, 1);
        l1.appendPoint(2, 2);
        l1.appendPoint(3, 3);
        System.out.println("Polyline 1 sau khi thêm điểm: " + l1); // Kết quả: {(1,1)(2,2)(3,3)}

        // 3. Kiểm tra constructor với danh sách điểm có sẵn
        List<Point> vList = new ArrayList<Point>();
        vList.add(new Point(0, 0));
        vList.add(new Point(4, 0));
        vList.add(new Point(4, 3));

        Polyline l2 = new Polyline(vList);
        System.out.println("\nPolyline 2: " + l2); // Kết quả: {(0,0)(4,0)(4,3)}

        // 4. Kiểm tra tính tổng chiều dài (getLength)
        // Khoảng cách (0,0) đến (4,0) là 4.0
        // Khoảng cách (4,0) đến (4,3) là 3.0
        // Tổng chiều dài mong đợi: 7.0
        System.out.println("Tổng chiều dài Polyline 2: " + l2.getLength());
    }
}