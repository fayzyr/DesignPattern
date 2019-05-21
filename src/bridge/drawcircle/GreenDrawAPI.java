package bridge.drawcircle;

/**
 * 桥接类
 */
public class GreenDrawAPI implements DrawAPI{
    @Override
    public void drawCircle(int centerX, int centerY, int radius) {
        System.out.println("以("+centerX+","+centerY+")为中心,"+radius+"为半径，画一个绿色的圆");
    }
}
