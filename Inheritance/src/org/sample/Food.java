package org.sample;

public abstract class Food {
    public int price;
    public String madeIn;

    public Food(int price, String madeIn) {
        this.price = price;
        this.madeIn = madeIn;
    }

    abstract String getDetail();
}
