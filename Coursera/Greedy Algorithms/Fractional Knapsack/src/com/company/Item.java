package com.company;

public class Item implements Comparable<Item>{
    double weight;
    double value;
    Double value_per_weight;

    public Item(double weight, double value){
        this.weight = weight;
        this.value = value;
        this.value_per_weight = value / weight;
    }

    @Override
    public int compareTo(Item item) {
        // reverse order
        return item.value_per_weight.compareTo(this.value_per_weight);
    }

    @Override
    public String toString() {
        return "Item{" +
                "weight=" + weight +
                ", value=" + value +
                ", value_per_weight=" + value_per_weight +
                '}';
    }

    public Item setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public Item setValue(double value) {
        this.value = value;
        return this;
    }
}