package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static ArrayList<Item> fractional_knapsack(ArrayList<Item> items, int knapsackCapacity){
        ArrayList<Item> itemsInKnapsack = new ArrayList<>();
        double currentWeight = 0.0;
        Iterator<Item> currentItem = items.iterator();

        while (currentWeight <= knapsackCapacity && currentItem.hasNext()) {
            Item item = currentItem.next();
            itemsInKnapsack.add(item);
            currentWeight += item.weight;
        }

        double weightOfLastItem = currentWeight - knapsackCapacity;
        Item lastItem = itemsInKnapsack.get(itemsInKnapsack.size() - 1);

        Item updatedItem = lastItem
                .setWeight(lastItem.weight - weightOfLastItem)
                .setValue(lastItem.value - lastItem.value_per_weight * weightOfLastItem);

        itemsInKnapsack.set(itemsInKnapsack.size() - 1, updatedItem);

        return itemsInKnapsack;
    }

    public static void main(String[] args) {
        // Video Example

        /*
        final int knapsackCapacity = 7;
        ArrayList<Item> items = new ArrayList<>(Arrays.asList(
                new Item(4, 20),
                new Item(3, 18),
                new Item(2, 14)
        ));
        */

        // Sample 1:

        /*
        final int knapsackCapacity = 50;
        ArrayList<Item> items = new ArrayList<>(Arrays.asList(
                new Item(20, 60),
                new Item(50, 100),
                new Item(30, 120)
        ));
        */

        // Sample 2:

        final int knapsackCapacity = 10;
        ArrayList<Item> items = new ArrayList<>(Collections.singletonList(
                new Item(30, 500)
        ));

        Collections.sort(items);
        ArrayList<Item> itemsInKnapsack = fractional_knapsack(items, knapsackCapacity);
        itemsInKnapsack.forEach(System.out::println);

        System.out.println("Total Value: " +
                itemsInKnapsack.stream().mapToDouble(item -> item.value).sum());
    }
}
