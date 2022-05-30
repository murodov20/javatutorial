package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ex3_label {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel label = new JLabel("Assalom aleykum");

        label.setBounds(20, 100, 300, 30);

        JButton btn = new JButton("knopka ");
        btn.setBounds(10, 10, 300, 30);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                btn.setText("Knopka bosildi");
            }
        });
        frame.add(label);
        frame.add(btn);

        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
