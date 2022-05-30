package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ex2_button {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton btn = new JButton("knopka ");
        btn.setBounds(10, 10, 300, 30);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                btn.setText("Knopka bosildi");
            }
        });

        frame.add(btn);

        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
