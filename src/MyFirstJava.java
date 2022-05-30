import drawing.DrawCanvas;

import javax.swing.*;

public class MyFirstJava {

    public static void main(String[] args) {

        int w = 640, h = 480;
        JFrame frame = new JFrame("Grafika");
        DrawCanvas canvas = new DrawCanvas(w, h);
        frame.setSize(w, h);
        frame.add(canvas);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
