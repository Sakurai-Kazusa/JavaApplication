package org.sample;

public class FruitsPair <T extends Fruits> {
    public T first;
    public T second;

    FruitsPair(T first, T second) {
        this.first = first;
        this.second = second;
    }
}
