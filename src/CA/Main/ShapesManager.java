package CA.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

//This class should take in Shape objects, paint them to the panel
//TODO toggle shape names in "showDisplayName" i.e "rectangle", "circle" etc
public class ShapesManager extends JPanel {
    private final ArrayList<Shape> shapeArrayList = new ArrayList<>();
    boolean showDisplayName;

    //called from test class, adds created shapes to the shapes arraylist
    public void addShape(Shape shape) {
        shapeArrayList.add(shape);
//        System.out.println(shapeArrayList.size());
    }

    public void showDisplayName(boolean b) {
    }

    public void drawShapes(Graphics g) {

        //for each loop, goes through each shape and calls their respective drawShape method
        shapeArrayList.forEach(shape -> shape.drawShape(g));

    }

    public void shapeClick(MouseEvent e){
        Point point = new Point(e.getX(),e.getY());
        System.out.println("click check");

//        for (Shape s : shapeArrayList) {
//
////            if(s(e.getPoint())) {
////                System.out.println("shape");
////            }
//        }

    }


}

