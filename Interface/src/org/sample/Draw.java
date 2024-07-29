package org.sample;

import javax.swing.*;
import java.awt.*;

public class Draw extends JPanel {
    public void paint(Graphics g) {
        super.paintComponent(g);
        g.drawPolygon(new int[] {125,150,100}, new int[] {100,150,150}, 3);
    }
}
