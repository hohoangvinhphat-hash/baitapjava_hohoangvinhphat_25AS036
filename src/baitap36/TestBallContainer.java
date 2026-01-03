package baitap36;

public class TestBallContainer {
    public static void main(String[] args) {
        // Tạo bóng tại (50, 50), bán kính 5, tốc độ 10, hướng 45 độ
        Ball ball = new Ball(50, 50, 5, 10, 45);
        // Tạo khung hình chữ nhật từ (0,0) đến (100, 100)
        Container box = new Container(0, 0, 100, 100);

        for (int step = 0; step < 5; step++) {
            ball.move();
            System.out.println(ball);
            if (box.collides(ball)) {
                System.out.println("Va chạm với tường!");
            }
        }
    }
}