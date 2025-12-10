package baitap26;

public class TestMain {

    public static void main(String[] args) {

        System.out.println("### 1. Constructor and toString() Test ###");


        MyPoint pDefault = new MyPoint();
        System.out.println("pDefault: " + pDefault); // Expected: (0,0)


        MyPoint pA = new MyPoint(3, 4);
        System.out.println("pA: " + pA); // Expected: (3,4)


        MyPoint pB = new MyPoint(6, 8);
        System.out.println("pB: " + pB); // Expected: (6,8)

        System.out.println("\n-------------------------------------------");


        System.out.println("### 2. Getters and Setters Test ###");

        System.out.println("pA coordinates (getX, getY): " + pA.getX() + ", " + pA.getY()); // Expected: 3, 4


        pA.setX(10);
        pA.setY(20);
        System.out.println("pA after setX(10), setY(20): " + pA); // Expected: (10,20)


        pA.setXY(1, 1);
        int[] coords = pA.getXY();
        System.out.println("pA after setXY(1, 1): " + pA); // Expected: (1,1)
        System.out.println("Coordinates from getXY(): {" + coords[0] + ", " + coords[1] + "}"); // Expected: {1, 1}

        System.out.println("\n-------------------------------------------");


        System.out.println("### 3. Overloaded distance() Methods Test ###");

        MyPoint pStart = new MyPoint(5, 12); // Revert to a clean point for testing
        MyPoint pEnd = new MyPoint(8, 16);   // (8, 16)


        System.out.printf("Distance from %s to origin (0,0): %.2f%n", pStart, pStart.distance());

        System.out.printf("Distance from %s to (8,16) (coords): %.2f%n", pStart, pStart.distance(8, 16));

        System.out.printf("Distance from %s to %s (object): %.2f%n", pStart, pEnd, pStart.distance(pEnd));

    }
}