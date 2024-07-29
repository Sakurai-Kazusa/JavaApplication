package org.sample;

public class Pair2 <T, S> {
    public T first;
    public S second;

    Pair2(T first, S seconds) {
        this.first = first;
        this.second = seconds;
    }
    
    @Override
    public String toString() {
        return "(" + this.first + "," + " " + this.second + ")";
    }
}
