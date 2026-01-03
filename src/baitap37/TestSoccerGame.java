package baitap37;

public class TestSoccerGame {
    public static void main(String[] args) {
        Ball ball = new Ball(10, 10, 0);
        Player p1 = new Player(7, 5, 5); // Cầu thủ số 7 tại (5, 5)

        System.out.println("Vị trí bóng: " + ball);
        System.out.println("Cầu thủ gần bóng không? " + p1.near(ball));

        p1.move(5, 5); // Di chuyển đến gần bóng
        System.out.println("Sau khi di chuyển, cầu thủ gần bóng không? " + p1.near(ball));

        p1.kick(ball);
        System.out.println("Sau khi sút, vị trí bóng mới: " + ball);

        p1.jump(2);
        System.out.println("Cầu thủ nhảy lên, z = 2.0");
    }
}
