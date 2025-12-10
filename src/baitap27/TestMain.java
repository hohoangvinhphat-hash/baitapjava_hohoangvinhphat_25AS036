package baitap27;


public class TestMain {


    public static double toDegrees(double radians) {
        return radians * 180 / Math.PI;
    }

    public static void main(String[] args) {

        System.out.println("### KIỂM THỬ LỚP MyLine ###");


        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(4, 5);

        System.out.println("\n--- 1. Constructors và toString() ---");

        MyLine lineA = new MyLine(0, 0, 3, 4); // Line (0,0) to (3,4)
        System.out.println("lineA (0,0)-(3,4): " + lineA); // Expected: MyLine[begin=(0,0), end=(3,4)]

        MyLine lineB = new MyLine(p1, p2); // Line (1,1) to (4,5)
        System.out.println("lineB (1,1)-(4,5): " + lineB); // Expected: MyLine[begin=(1,1), end=(4,5)]

        System.out.println("\n--- 2. Getters và Setters Tọa độ ---");

        System.out.println("lineB Begin X: " + lineB.getBeginX()); // Expected: 1
        System.out.println("lineB End Y: " + lineB.getEndY());     // Expected: 5

        lineB.setBeginXY(10, 20); // Dùng setBeginXY
        lineB.setEndX(30);        // Dùng setEndX
        lineB.setEndY(40);        // Dùng setEndY
        System.out.println("lineB sau setters: " + lineB); // Expected: (10,20)-(30,40)

        int[] endCoords = lineB.getEndXY();
        System.out.println("Tọa độ End từ getEndXY(): {" + endCoords[0] + ", " + endCoords[1] + "}");

        System.out.println("\n--- 3. getLength() và getGradient() ---");

        System.out.println("Kiểm tra LineA: " + lineA);
        System.out.printf("Độ dài (Length): %.2f%n", lineA.getLength());

        double gradientRad = lineA.getGradient();
        System.out.printf("Độ dốc (Radian): %.4f%n", gradientRad);
        System.out.printf("Độ dốc (Độ): %.2f%n", toDegrees(gradientRad));

        MyLine verticalLine = new MyLine(5, 0, 5, 10);
        System.out.println("\nKiểm tra Line đứng: " + verticalLine);
        System.out.printf("Độ dài: %.2f%n", verticalLine.getLength());
        System.out.printf("Độ dốc (Radian): %.4f%n", verticalLine.getGradient());
        System.out.printf("Độ dốc (Độ): %.2f%n", toDegrees(verticalLine.getGradient()));
    }
}