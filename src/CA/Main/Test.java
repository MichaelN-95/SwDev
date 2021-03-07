package CA.Main;


import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String[] args) {
        ShapesManager shapesManager = new ShapesManager();
        shapesManager.showDisplayName(true);


        Rectangle rectangle = new Rectangle(Color.red, false,50,121,100, 81);

        Rectangle square = new Rectangle(Color.red, false,190,121,81, 81);

        Quadrilateral quad = new Quadrilateral(Color.blue,false,(new Point(220,200)),(new Point(200,220)),(new Point(220,360)),(new Point(240,350)));
//      Quadrilateral quadrilateral = new Quadrilateral(Color.pink,false,rectangle);
        shapesManager.addShape(quad);


        shapesManager.addShape(rectangle);
        shapesManager.addShape(square);
        shapesManager.addShape(new Circle(Color.black,true,700,200,50));


        //creating the window with basic information
        CustomWindow customWindow = new CustomWindow(shapesManager);
        customWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        customWindow.setTitle("Michael's CA");
        customWindow.setVisible(true);


    }
}
