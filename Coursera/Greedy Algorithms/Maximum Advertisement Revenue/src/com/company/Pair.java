package com.company;

public class Pair <T, K> {
    public final T first;
    public final K second;

    public Pair(T first, K second){
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair(" + first + ", " + second + ")";
    }
}
