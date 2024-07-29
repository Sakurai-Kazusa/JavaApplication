package org.sample;

public class Quadruple <T> {
    public T first;
    public T second;
    public T third;
    public T fourth;

    Quadruple(T first, T second, T third, T fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }

    public static <X> Quadruple<X> getQuadrupleBy(Pair<Pair<X>> pairPair) {
        return new Quadruple<X>(
                pairPair.first.first,
                pairPair.first.second,
                pairPair.second.first,
                pairPair.second.second
        );
    }

    @Override
    public String toString() {
        return "[" + this.first + "," + " " + this.second + "," + " " + this.third + " " + " " + this.fourth + "]";
    }
}
