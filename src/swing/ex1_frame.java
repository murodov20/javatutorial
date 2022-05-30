package swing;

import javax.swing.*;

public class ex1_frame {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton btn = new JButton("knopka");
        btn.setBounds(10, 10, 100, 30);
        frame.add(btn);

        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
