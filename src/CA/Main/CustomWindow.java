package CA.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.security.cert.PolicyNode;

/**
 * We can think of a JFrame as a window
 * By extending (inheriting from) the class javax.swing.JFrame we can
 * define what goes into our window - in this case a single JPanel which is
 * a component container for GUI elements.
 */
public class CustomWindow extends JFrame implements MouseListener {
    private CustomPanel mainPanel;
    public CustomWindow(ShapesManager shapesManager)
    {
        mainPanel = new CustomPanel(shapesManager);
        mainPanel.addMouseListener(this);
//        mainPanel.addMouseListener(mainPanel);
        //add our new panel to the frame
        add(mainPanel, BorderLayout.CENTER);
        //set the dimensions of the frame/window
        setSize(Consts.FRAME_WIDTH, Consts.FRAME_HEIGHT);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        Point point = new Point(e.getX(),e.getY());
        System.out.println(point.getX() + point.getY());
//        if (point.getX() && point.getX() == )
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