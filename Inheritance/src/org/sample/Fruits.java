package org.sample;

import java.util.Objects;

public abstract class Fruits extends Food {
    public int price;
    public String madeIn;
    public String color;

    public Fruits(int price, String madeIn, String color) {
        super(price, madeIn);
        this.color = color;
    }

    public Fruits(int price, String madeIn) {
        super(price, madeIn);
    }

    /*
    public String getDetail() {
        return "生産地は" +  this.madeIn + "、" + "色は" + this.color + "\n";
    }
    */

    public boolean isMadeInJapan() {
        return this.madeIn.equals("Japan");
    }

    @Override
    public String toString() {
        return "果物の値段は" + this.price + "円です。\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this.getClass() != o.getClass()) {
            return false;
        } else {
            Fruits f = (Fruits) o;
            return this.color.equals(f.color) && this.madeIn.equals(f.madeIn) && (this.price == ((Fruits) o).price);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, color, madeIn);
    }
}
