package CA.Main;

import java.awt.*;

public class Square extends Rectangle{
    private final int width;
    private final int height;

    public Square(Color color, boolean filled, int xCenter, int yCenter, int width, int height) {
        super(color, filled);
        this.xCenter = xCenter;
        this.yCenter = yCenter;
        this.width = width;
        this.height = height;
    }

    @Override
    public void drawShape(Graphics g) {
        g.setColor(color);
        g.drawRect(xCenter,yCenter,width,height);
    }
}
