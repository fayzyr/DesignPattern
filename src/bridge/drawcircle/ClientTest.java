package bridge.drawcircle;


public class ClientTest {
    /**
     * 命令模式
     *
     * @param args
     */
    public static void main(String[] args) {
        Circle yellowCircle = new Circle(8, 8, 50, new YellowDrawAPI());
        Circle greenCircle = new Circle(66, 66, 60, new GreenDrawAPI());
        yellowCircle.draw();
        greenCircle.draw();
    }
}
