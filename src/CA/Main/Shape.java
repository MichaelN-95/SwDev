package CA.Main;

import java.awt.*;

public abstract class Shape {
    Color color; //The Color class is in java.awt
    boolean filled;
    int xCenter;
    int yCenter;
    int width;
    int height;

    public Shape(Color color, boolean filled, int xCenter, int yCenter) {
        this.color = color;
        this.filled = filled;
        this.xCenter = xCenter;
        this.yCenter = yCenter;
    }
    public Shape(Color color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    //needed as per doc
    public abstract void drawShape(Graphics g);

    public abstract void setBoundingBox(int xCenter,int yCenter);

    @Override
    public String toString() {
        return "Shape{" +
                "color=" + color +
                ", filled=" + filled +
                ", xCenter=" + xCenter +
                ", yCenter=" + yCenter +
                '}';
    }
}
