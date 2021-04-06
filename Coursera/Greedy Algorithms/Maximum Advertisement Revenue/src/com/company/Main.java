package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static int maximumProfit(ArrayList<Pair<Integer, Integer>> slots){
        return slots.stream().mapToInt(pair -> pair.first * pair.second).sum();
    }

    public static ArrayList<Pair<Integer, Integer>> getPairsOfSlots(ArrayList<Integer> profits, ArrayList<Integer> clicksPerDay) {
        ArrayList<Pair<Integer, Integer>> maximumPairs = new ArrayList<>();

        for(int i = profits.size() - 1; i >= 0; i--)
            maximumPairs.add(new Pair<>(profits.get(i), clicksPerDay.get(i)));

        return maximumPairs;
    }

    public static void main(String[] args) {
        // Sample 1:
        /*
        ArrayList<Integer> profits = new ArrayList<>(
                Collections.singletonList(23)
        );

        ArrayList<Integer> clicksPerDay = new ArrayList<>(
                Collections.singletonList(39)
        );
        */

        // Sample 2:

        ArrayList<Integer> profits = new ArrayList<>(
          Arrays.asList(1, 3, -5)
        );

        ArrayList<Integer> clicksPerDay = new ArrayList<>(
                Arrays.asList(-2, 4, 1)
        );

        Collections.sort(profits);
        Collections.sort(clicksPerDay);

        ArrayList<Pair<Integer, Integer>> slots = getPairsOfSlots(profits, clicksPerDay);
        slots.forEach(System.out::println);

        System.out.println("- Maximum Profits: " + maximumProfit(slots));
    }
}
