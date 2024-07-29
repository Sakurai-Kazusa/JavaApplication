package org.sample;

import javax.swing.*;

public class GameWindow extends JFrame {
    public GameWindow() {
        JFrame jf = new JFrame();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}
