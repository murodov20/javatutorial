package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ex4_textfield {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel label1 = new JLabel("Loginni kiriting: ");
        label1.setBounds(20,20,200, 30);
        JTextField field1 = new JTextField();
        field1.setBounds(20, 50, 200, 30);

        JLabel label2 = new JLabel("Parolni kiriting: ");
        label2.setBounds(20,100,200, 30);
        JTextField field2 = new JTextField();
        field2.setBounds(20, 130, 200, 30);

        frame.add(label1);
        frame.add(field1);

        frame.add(label2);
        frame.add(field2);

        JButton btn = new JButton("Kirish ");
        btn.setBounds(20, 200, 200, 30);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                btn.setText("Kirish bajarildi");
            }
        });
        frame.add(btn);

        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
