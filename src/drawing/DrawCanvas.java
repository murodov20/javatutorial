package drawing;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class DrawCanvas extends JComponent {

    private int width;
    private int height;

    public DrawCanvas(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(new Color(100, 149, 237));
        // x coordinates of vertices
        int[] x = {10, 30, 40, 50, 110, 140};

        // y coordinates of vertices
        int[] y = {140, 110, 50, 40, 30, 10};
        Polygon polygon = new Polygon(x, y, 6);

        g2d.drawPolyline(x, y, 6);


    }
}
