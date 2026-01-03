package baitap37;

public class Player {
    private int number;
    private float x, y, z = 0.0f;

    public Player(int number, float x, float y) {
        this.number = number; this.x = x; this.y = y;
    }

    public void move(float xDisp, float yDisp) { x += xDisp; y += yDisp; }
    public void jump(float zDisp) { z += zDisp; }

    public boolean near(Ball ball) {
        double dist = Math.sqrt(Math.pow(x - ball.getX(), 2) +
                Math.pow(y - ball.getY(), 2) +
                Math.pow(z - ball.getZ(), 2));
        return dist < 8;
    }

    public void kick(Ball ball) {
        if (near(ball)) {
            // Logic sút bóng đơn giản: cập nhật vị trí bóng
            ball.setXYZ(ball.getX() + 5, ball.getY() + 5, ball.getZ());
        }
    }
}