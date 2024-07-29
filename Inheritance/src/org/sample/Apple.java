package org.sample;

public class Apple extends Fruits {
    String taste;

    public Apple(int price, String madeIn, String color, String taste) {
        super(price, madeIn, color);
        this.taste = taste;
    }

    @Override
    public String getDetail() {

        return "このリンゴの生産地は" + this.madeIn + "," + "色は" + this.color + "\n";
    }
}
