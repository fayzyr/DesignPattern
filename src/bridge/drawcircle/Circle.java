package bridge.drawcircle;

public class Circle extends Shape{
    public Circle(int centerX, int centerY, int radius, DrawAPI drawAPI) {
        super(centerX, centerY, radius, drawAPI);
    }

    @Override
    void draw() {
        drawAPI.drawCircle(centerX,centerY,radius);
    }
}
