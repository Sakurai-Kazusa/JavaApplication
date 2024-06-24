package org.sample;

import java.awt.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Drawable h = new Hero();
        // h.draw();
        Triangle t1 = new Triangle(
                new Point(3, 2),
                new Point(1, 3),
                new Point(1, 1)
        );
        Hero hero = new Hero();
        List<Drawable> list = List.of(t1, hero);
        for (Drawable e : list) {
            e.draw();
        }
        /*
        t1.draw();
        System.out.println(t1.getArea());
        t1.parallelMovable();
        t1.rotate();
         */
    }
}