package CA.Main;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

//This class should take in Shape objects, paint them to the panel
//TODO toggle shape names in "showDisplayName" i.e "rectangle", "circle" etc
//todo implement drawShapes
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

        // to be used to draw shapes
        //for each loop goes through each shape in the shapesArrayList


    }

