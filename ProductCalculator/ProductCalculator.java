package ProductCalculator;

import javax.swing.*;

public class ProductCalculator {
    private JButton Button;
    private JPanel panel1;

    public void run() {
        JFrame frame = new JFrame();
        frame.setContentPane(panel1);
        frame.setTitle("Bereken Product");
        frame.pack();
        frame.setSize(800, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
