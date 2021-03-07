package CA.Main;

public class BoundingBox {
    private Point bottomLeft = new Point(0,0);
    private Point topRight= new Point(0,0);
    int xCenter;
    int yCenter;

    public Point getBottomLeft() {
        return bottomLeft;
    }

    public Point getTopRight() {
        return topRight;
    }

    int width;
    int height;

    public BoundingBox(int xCenter, int yCenter, int width,int height) {

        this.xCenter = xCenter;
        this.yCenter = yCenter;
        this.width = width;
        this.height=height;
        getPoints();
    }

    private void getPoints() {
        bottomLeft.setX(xCenter-(width/2));
        bottomLeft.setY(xCenter+height/2);

        topRight.setX(xCenter+(width/2));
        topRight.setY(xCenter-(height/2));
    }

    @Override
    public String toString() {
        return "BoundingBox{" +
                "bottomLeft=" + bottomLeft +
                ", topRight=" + topRight +
                '}';
    }
}
