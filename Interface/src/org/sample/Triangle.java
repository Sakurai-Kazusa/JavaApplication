package org.sample;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Triangle extends JPanel implements Drawable, Measureable, Movable{
    Point p1;
    Point p2;
    Point p3;

    Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    public void draw(Graphics graphics) {
        GameWindow gw = new GameWindow();
        super.paintComponent(graphics);
        int[] xCoordinate = {this.p1.x, this.p2.x, this.p3.x};
        int[] yCoordinate = {this.p1.y, this.p2.y, this.p3.y};
        graphics.setColor(Color.BLACK);
        graphics.drawPolygon(xCoordinate, yCoordinate, 3);
        graphics.dispose();
        //graphics.drawLine(this.p1.x, this.p1.y, this.p2.x, this.p2.y);
        //graphics.drawLine(this.p2.x, this.p2.y, this.p3.x, this.p3.y);
        //graphics.drawLine(this.p3.x, this.p3.y, this.p1.x, this.p1.y);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Triangle t2 = new Triangle(
                new Point(200,30),
                new Point(250,150),
                new Point(120,120));
        t2.draw(g);
    }

    @Override
    public int getArea() {
        // ヘロンの公式より　T = √s(s-a)(s-b)(s-c), s = (a + b + c) / 2
        // 2点間の距離を求める java.awt.geom.Point2D.distance(double pt);
        int DIVIDE_BY_FOR_TRIANGLE_AREA = 2;
        double ab = this.p1.distance(this.p2);
        double bc = this.p2.distance(this.p3);
        double ca = this.p3.distance(this.p1);
        double s = (ab + bc + ca) / DIVIDE_BY_FOR_TRIANGLE_AREA;
        double t = Math.sqrt( s * (s - ab) * (s - bc) * (s - ca) );
        return (int) t;
    }

    @Override
    public int getPerimeter() {
        return 0;
    }

    @Override
    public void rotate() {
        System.out.println("回転しました。");
    }

    @Override
    public void parallelMovable() {
        System.out.println("平行移動しました。");
    }
}
