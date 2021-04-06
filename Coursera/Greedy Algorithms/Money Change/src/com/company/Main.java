package com.company;

import java.util.*;

public class Main {

    public static Map<Integer, Integer> money_change(int amount, ArrayList<Integer> coins){
        if(amount <= 1){
            return new HashMap<>(){{
                put(1, amount);
                put(5, 0);
                put(10, 0);
            }};
        }

        Map<Integer, Integer> minimumCoins = new HashMap<>(){{
            put(1, 0);
            put(5, 0);
            put(10, 0);
            }};
        coins.sort(Collections.reverseOrder());

        int currentAmount = amount;

        for(Integer coin: coins)
        {
            while(currentAmount >= coin)
            {
                currentAmount-= coin;
                minimumCoins.put(coin, minimumCoins.get(coin) == 0 ? 1
                        : minimumCoins.get(coin) + 1);
            }
        }
        return minimumCoins;
    }

    public static void main(String[] args) {
        ArrayList<Integer> coins = new ArrayList<>(Arrays.asList(10, 1, 5));

	    // Sample 1:
        int amount = 2;

        // Sample 2:
        // int amount = 28;

        Map<Integer, Integer> minimumCoins = money_change(amount, coins);
        minimumCoins.forEach((key, value) -> System.out.println(key + ": " + value));

        System.out.println("Minimum amount of coins needed: " +
                minimumCoins.values().stream().mapToInt(value -> value).sum());
    }
}
