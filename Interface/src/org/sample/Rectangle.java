package org.sample;

import java.awt.*;

public class Rectangle extends Shape implements Drawable, Measureable, Movable{
    Point p1;
    Point p2;
    Point p3;
    Point p4;

    Rectangle(Point p1, Point p2, Point p3, Point p4){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }
    @Override
    public void draw(Graphics graphics) {
        System.out.println("長方形を書きました。");
    }

    @Override
    public int getArea() {
        // 面積は△2つであるものとする
        // ヘロンの公式より　T = √s(s-a)(s-b)(s-c), s = (a + b + c) / 2
        // 2点間の距離を求める java.awt.geom.Point2D.distance(double pt);
        int DIVIDE_BY_FOR_TRIANGLE_AREA = 2;
        double ab = this.p1.distance(this.p2);
        double bc = this.p2.distance(this.p3);
        double ca = this.p3.distance(this.p1);
        double abcS = (ab + bc + ca) / DIVIDE_BY_FOR_TRIANGLE_AREA;
        double abcT = Math.sqrt( abcS * (abcS - ab) * (abcS - bc) * (abcS - ca) );
        double ac = this.p1.distance(this.p3);
        double cd = this.p3.distance(this.p4);
        double da = this.p4.distance(this.p1);
        double acdS = (ac + cd + da) / DIVIDE_BY_FOR_TRIANGLE_AREA;
        double acdT = Math.sqrt( acdS * (acdS - ac) * (acdS - cd) * (acdS - da) );
        double rectArea = abcT + acdT;
        return (int) rectArea;
    }

    @Override
    public int getPerimeter() {
        return 0;
    }

    @Override
    public void rotate() {

    }

    @Override
    public void parallelMovable() {

    }
}
