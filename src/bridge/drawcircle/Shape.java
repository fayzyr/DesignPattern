package bridge.drawcircle;

public abstract class Shape {
    DrawAPI drawAPI;
    int centerX, centerY, radius;

    public Shape(int centerX, int centerY, int radius, DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    abstract void draw();
}
