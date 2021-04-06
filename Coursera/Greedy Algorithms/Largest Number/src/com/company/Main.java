package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    private static boolean IsGreaterOrEqual(Integer digit, Integer maximumDigit){
        int firstCombination =  Integer.parseInt(String.valueOf(digit) + maximumDigit);
        int secondCombination = Integer.parseInt(String.valueOf(maximumDigit) + digit);

        return firstCombination >= secondCombination;
    }

    public static String findLargest(ArrayList<Integer> digits){
        StringBuilder result = new StringBuilder();

        while(digits.size() != 0)
        {
            Integer maximum = digits.get(0);
            int indexMaximum = 0;

            for(int i = 1; i < digits.size(); i++)
            {
                Integer currentValue = digits.get(i);
                if(IsGreaterOrEqual(currentValue, maximum)) {
                    maximum = currentValue;
                    indexMaximum = i;
                }
            }
            result.append(maximum);
            digits.remove(indexMaximum);

        }
        return result.toString();
    }

    public static void main(String[] args) {

        // 221
        /*
        ArrayList<Integer> digits = new ArrayList<>(
                Arrays.asList(2, 21)

        );

        // 99641
        /*
        ArrayList<Integer> digits = new ArrayList<>(
                Arrays.asList(9, 4, 6, 1, 9)

        );
         */

        // 923923
        ArrayList<Integer> digits = new ArrayList<>(
                Arrays.asList(23, 39, 92)

        );
        System.out.println(findLargest(digits));
    }
}
