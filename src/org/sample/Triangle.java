package org.sample;

import java.awt.*;

public class Triangle extends Shape implements Drawable, Measureable, Movable{
    Point p1;
    Point p2;
    Point p3;

    Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    public void draw() {
        System.out.println("三角形を書きました。");
    }

    @Override
    public int getArea() {
        // ヘロンの公式より　T = √s(s-a)(s-b)(s-c), s = (a + b + c) / 2
        // 2点間の距離を求める java.awt.geom.Point2D.distance(double pt);
        double ab = this.p1.distance(this.p2);
        double bc = this.p2.distance(this.p3);
        double ca = this.p3.distance(this.p1);
        int DIVIDE_BY_FOR_TRIANGLE_AREA = 2;
        double s = (ab + bc + ca) / DIVIDE_BY_FOR_TRIANGLE_AREA;
        double t = Math.sqrt(s * (s - ab) * (s - bc) * (s - ca));
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
