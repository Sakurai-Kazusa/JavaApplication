package org.sample;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(
                new Point(100, 30),
                new Point(150, 100),
                new Point(50, 100)
        );

        Rectangle r1 = new Rectangle(
                new Point(100, 230),
                new Point(50, 260),
                new Point(50, 300),
                new Point(200, 300)
        );

        // GUI画面作成
//        int GUI_WIDTH = 800;
//        int GUI_HEIGHT = 600;
//        JFrame.setDefaultLookAndFeelDecorated(true);
//        JFrame jFrame = new JFrame();
//        jFrame.getContentPane();
//        jFrame.setTitle("Polygon");
//        jFrame.setSize(GUI_WIDTH, GUI_HEIGHT);
//        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        jFrame.setBackground(Color.white);
//        jFrame.setVisible(true);
//        t1.draw(jFrame.getGraphics());


        System.out.println(t1.getArea());
        System.out.println(r1.getArea());
    }
}