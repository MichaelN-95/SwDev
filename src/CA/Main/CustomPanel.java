package CA.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//import java.util.ArrayList;
/**
 * This allows us to create a panel which we can add to a frame/window
 * Oftentimes, you would then add standard GUI components, e.g. JButton, JLabel, to the
 * panel.
 * In our case, though, we will want to draw shapes, so we override the paintComponent() method
 * that we inherit from the javax.swing.JPanel class.
 * The graphics system passes us a java.awt.Graphics object and this has methods which allows us
 * to draw shapes.
 */
public class CustomPanel extends JPanel implements MouseListener {
    ShapesManager shapesManager;
    public CustomPanel(ShapesManager shapesManager) {
        this.shapesManager=shapesManager;

        addMouseListener(new MouseAdapter() {
            /**
             * {@inheritDoc}
             *
             * @param e
             */
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                shapesManager.shapeClick(e);
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        //The superclass does some important work in the method we've overridden, so we
        //should invoke it.
//        System.out.println("CustomPanel.paintComponent");
        super.paintComponent(g);
//        this.shapesManager.drawShapes(g);
        shapesManager.drawShapes(g);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("CustomPanel.mouseClicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}