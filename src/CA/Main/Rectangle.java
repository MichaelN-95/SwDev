package CA.Main;

import java.awt.*;

public class Rectangle extends Shape implements Movable{


    private int width;
    private int height;

    public Rectangle(Color color, boolean filled, int xCenter, int yCenter,int width,int height) {
        super(color, filled, xCenter, yCenter);
        this.width = width;
        this.height= height;
    }
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void drawShape(Graphics g) {

        if (width==height){
            System.out.println("square");
            Square square = new Square(color,true,xCenter,yCenter,width,height);
            square.drawShape(g);
        }else {
            g.setColor(color);
            g.drawRect(xCenter, yCenter, width, height);
        }
    }

    @Override
    public void moveTenX() {

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", color=" + color +
                ", filled=" + filled +
                ", xCenter=" + xCenter +
                ", yCenter=" + yCenter +
                '}';
    }
}
