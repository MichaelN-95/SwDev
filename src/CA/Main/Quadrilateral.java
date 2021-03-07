package CA.Main;

import java.awt.*;

public class Quadrilateral extends Shape implements Rotatable {
    Point[] points = new Point[4];
    int[] xPoints = new int[4];
    int[] yPoints = new int[4];
    int nPoints =4;


    public Quadrilateral(Color color, boolean b, Rectangle rectangle) {
        super(color, b,rectangle.xCenter,rectangle.yCenter);

    }

    public Quadrilateral(Color color, boolean b, Point point, Point point1, Point point2, Point point3) {
        super(color, b);

        this.xPoints[0]=point.getX();
        this.xPoints[1]= point1.getX();
        this.xPoints[2]= point2.getX();
        this.xPoints[3]= point3.getX();

        this.yPoints[0]=point.getY();
        this.yPoints[1]=point1.getY();
        this.yPoints[2]=point2.getY();
        this.yPoints[3]=point3.getY();
    }


    @Override
    public void drawShape(Graphics g) {
        g.setColor(color);


        if (filled){
            g.fillPolygon(xPoints,yPoints,nPoints);
        }
        else{
            g.drawPolygon(xPoints,yPoints,nPoints);
        }
    }

    @Override
    public void setBoundingBox(int xCenter, int yCenter) {

    }

    @Override
    public void rotate90() {

    }
}
