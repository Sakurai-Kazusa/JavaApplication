package org.sample;

import java.awt.*;

public class Hero implements Drawable {
    @Override
    public void draw(Graphics graphics) {
        System.out.println("勇者を書きました。");
    }
}
