package Question9;

import javax.swing.*;

public class StringFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("String Display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        JPanel panel = new JPanel();
        panel.setBackground(new java.awt.Color(255, 192, 203));
        JLabel label = new JLabel("Hello, World!");
        label.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 20));
        panel.add(label);

        frame.add(panel);
        frame.setVisible(true);
    }
}
