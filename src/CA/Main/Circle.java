package CA.Main;

import java.awt.*;

public class Circle extends Shape {
    private int radius;
    private int width;
    private int height;

    public Circle(Color color, boolean filled, int xCenter, int yCenter, int radius) {
        super(color, filled, xCenter, yCenter);
        this.radius=radius;
    }

    @Override
    public void drawShape(Graphics g) {
        g.setColor(color);
//        g.drawOval(100,300,width- radius,20/2-radius);

        if (filled) {
            g.fillOval(xCenter/2 - radius,
                    yCenter/2 - radius,
                    radius * 2,
                    radius*2);
        }else {
            g.drawOval(xCenter/2 - radius,
                    yCenter/2 - radius,
                    radius * 2,
                    radius*2);
        }


    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
